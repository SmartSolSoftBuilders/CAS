package com.generalseguros.seguridad.bo;

import static com.generalseguros.db.CommonDB.tryToTrim;
import static com.generalseguros.dto.Permisos.MENU_CLAVE;
import static com.generalseguros.dto.Permisos.MENU_ID;
import static com.generalseguros.dto.Permisos.MENU_IMAGEN;
import static com.generalseguros.dto.Permisos.MENU_NOMBRE;
import static com.generalseguros.dto.Permisos.MENU_PADRE;
import static com.generalseguros.dto.Permisos.MENU_TOOLTIP;
import static com.generalseguros.dto.Permisos.MENU_URL;
import static com.generalseguros.dto.Permisos.SISTEMA_HASHVALUE;
import static com.generalseguros.dto.Permisos.SISTEMA_ID;
import static com.generalseguros.dto.Permisos.SISTEMA_NOMBRE;
import static com.generalseguros.dto.Permisos.SISTEMA_URL;
import static com.generalseguros.dto.Permisos.TIPO_USUARIO;
import static com.generalseguros.dto.Permisos.ID_USUARIO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;

import com.generalseguros.comun.SSOStringUtils;
import com.generalseguros.db.CommonDB;
import com.generalseguros.db.PropertyType;
import com.generalseguros.dto.Menu;
import com.generalseguros.dto.Permisos;
import com.generalseguros.dto.Sistema;
import com.generalseguros.dto.TipoUsuario;
import com.generalseguros.dto.Usuario;
import com.generalseguros.seguridad.IObtenPermisos;

public class ObtenPermisosDBImpl implements IObtenPermisos {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8096078883716978326L;
	private static final int INITIAL_LENGTH = 1;
	
	@Override
	public Permisos execute(Usuario usuario, Sistema sistema) {
		
		CommonDB db = new CommonDB();
		Permisos permisos = new Permisos();
		permisos.setUsuario(usuario);
		
		HashMap<Integer, Sistema > sistemasMap  = new HashMap<Integer, Sistema>();
		
		String nombreSistema = sistema.getNombre();
		
		String tipoUsuario = null;
		
		if(CommonDB.getPropertyValue(CommonDB.DEFAULT_SYSTEM, PropertyType.COMMON).equals(nombreSistema)){
			nombreSistema = SSOStringUtils.SEARCH_BY_ALL;
		}
		
		try {
			
			boolean executePS = true;
			if( CommonDB.getPropertyValue(CommonDB.DB_TYPE, PropertyType.COMMON).equals(CommonDB.HSQLDB) )
			{
				executePS = false;
			}
			
			ResultSet rs  = executePS ?
					db.executePreparedStatementQuery(OBTEN_PERMISOS_QUERY,new Object[]{ usuario.getNombreUsuario(), nombreSistema })
					: db.executeQuery(String.format(OBTEN_PERMISOS_QUERY, usuario.getNombreUsuario(), nombreSistema));
			while (rs.next()) {
				
				Integer sistemaId = rs.getInt(SISTEMA_ID);
				Integer menuId = rs.getInt(MENU_ID);
				Integer menuPadreId = rs.getInt(MENU_PADRE);
				
				String menuNombre = tryToTrim(rs.getString(MENU_NOMBRE));
				String menuClave = tryToTrim(rs.getString(MENU_CLAVE));
				String menuURL = tryToTrim(rs.getString(MENU_URL));
				String menuURLImagen = tryToTrim(rs.getString(MENU_IMAGEN));
				String menuTooltip = tryToTrim(rs.getString(MENU_TOOLTIP));
				
				tipoUsuario = tryToTrim(rs.getString(TIPO_USUARIO));
				
				Menu menu = new Menu();
				menu.setId(menuId);
				menu.setNombre(menuNombre);
				menu.setClave(menuClave);
				menu.setUrl(menuURL);
				menu.setUrlImagen(menuURLImagen);
				menu.setTooltip(menuTooltip);
				menu.setSistemaId(sistemaId);
				
				Menu[] menusPadre = null;
				
				if ( sistemasMap.containsKey(sistemaId) ){
					
					sistema = sistemasMap.get(sistemaId);
					
					if(sistema.getMenus() == null)
					{	
						menusPadre = new Menu[INITIAL_LENGTH];
						menusPadre[0] = menu; // initial menu value
					}
					else if(menuPadreId <= 0)
					{
						int posicion = sistema.getMenus().length;
						menusPadre = Arrays.copyOf(sistema.getMenus(), sistema.getMenus().length + 1 ); // increase the Array
						menusPadre[posicion] = menu; // will be the last element
					}
					else
					{
						menusPadre = agregarMenu(sistema.getMenus(), menuPadreId, menu);
					}
					
				}else{
					
					sistema = new Sistema();
					sistema.setId(sistemaId);
					sistema.setNombre(tryToTrim(rs.getString(SISTEMA_NOMBRE)));
					sistema.setUrl(tryToTrim(rs.getString(SISTEMA_URL)));
					sistema.setHashValue(tryToTrim(rs.getString(SISTEMA_HASHVALUE)));
					
					menusPadre = new Menu[INITIAL_LENGTH];
					
					menusPadre[0] = menu; // initial menu value
					sistemasMap.put(sistemaId, sistema);
				}
				
				sistema.setMenus(menusPadre);
				
				if ( usuario.getId() <= 0 )
				usuario.setId(rs.getInt(ID_USUARIO));
			} 
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeResources();
		}
		
		Sistema[] sistemas = new Sistema[sistemasMap.keySet().size()];
		int i=0; 
		for(Integer sistemaIdKey: sistemasMap.keySet()){
			sistemas[i++]= sistemasMap.get(sistemaIdKey); 
		}
		permisos.getUsuario().setTipoUsuario(new TipoUsuario(tipoUsuario));
		permisos.setSistemas(sistemas);
		
		return permisos;
	}
	
	private Menu[] agregarMenu(Menu[] menus, int menuId, Menu menuHijo) {
		
		if(menus == null)
		{
			return null;
		}
		for(Menu menu: menus)
		{	
			if(menu != null)
			{
				if ( menu.getId() == menuId)
				{
					agregarHijoAMenu(menu, menuHijo);
					return menus;
				}
				else if( agregarMenu(menu.getMenusHijos(), menuId, menuHijo) != null ) // Search in subelements
				{
					return menus;
				}
			}
		}
		
		return null; 
	}
	
	private void agregarHijoAMenu(Menu menuPadre, Menu menuHijo)
	{
		int posicion = 0; 
		Menu[] menuHijos;
		
		if( menuPadre.getMenusHijos() == null )
		{
			menuHijos = new Menu[INITIAL_LENGTH];
		}
		else
		{
			menuHijos = Arrays.copyOf(menuPadre.getMenusHijos(), menuPadre.getMenusHijos().length + 1 ); // increase the Array
			posicion= (menuHijos.length ) -1; // will be the last element
			
		}
		menuHijo.setMenuPadreId(menuPadre.getId());
		menuHijos[posicion] = menuHijo;
		menuPadre.setMenusHijos( menuHijos);
	}

}
