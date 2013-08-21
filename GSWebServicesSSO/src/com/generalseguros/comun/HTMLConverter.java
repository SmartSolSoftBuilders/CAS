package com.generalseguros.comun;

import com.generalseguros.db.CommonDB;
import com.generalseguros.db.PropertyType;
import com.generalseguros.dto.Menu;
import com.generalseguros.dto.Permisos;
import com.generalseguros.dto.Sistema;

public class HTMLConverter {
	
	private String ulCSSClassId = CommonDB.getPropertyValue(CommonDB.UL_CLASS_NAME, PropertyType.COMMON);
	private String liCSSClassId = CommonDB.getPropertyValue(CommonDB.LI_CLASS_NAME,PropertyType.COMMON);
	private boolean isFirstCSSClass= true;


	public String generateHTMLFromPermisos(Permisos permiso) {
		
		StringBuilder html = new StringBuilder(String.format(
				"<ul class=\"%s\">", ulCSSClassId));
		if (permiso.getSistemas() != null) {

			for (Sistema sistema : permiso.getSistemas()) {
				html.append(String.format("<li class=\"%s\">", liCSSClassId));
				html.append(String.format("<a href=\"%s\">%s</a>",
						sistema.getUrl(), sistema.getNombre()));
				

				if (sistema.getMenus() != null) {

					for (Menu menuNivel1 : sistema.getMenus()) {
						html.append("<ul>");
						generateHTMLMenus(menuNivel1, html);
						html.append("</ul>");
					}
				}
				html.append("</li>");
			}

		}

		html.append("</ul>");
		
		if(permiso.getUsuario() != null){
			html.append(String.format("<input type=\"hidden\" name=\"tipoUsuario\" value=\"%s\" />",permiso.getUsuario().getTipoUsuario().getRolDescripcion()));	
		}

		return html.toString();
	}
	
	private StringBuilder generateHTMLMenus(Menu menu, StringBuilder html)
	{
		if(menu == null)
		{
			html.append("</li>");
			return html;
		}
		

		html.append(String.format("<li%s",
				isFirstCSSClass ? " class=\""+liCSSClassId+"\">" : ">"));
		
		isFirstCSSClass = !isFirstCSSClass;
		
		html.append(String.format("<a href=\"%s\" title=\"%s\" >%s</a>",
				menu.getUrl(), menu.getTooltip(), menu.getNombre()));
		if(menu.getMenusHijos() != null )
		{
			html.append("<ul>");
			
			for (Menu menuHijo : menu.getMenusHijos()) 
			{
				generateHTMLMenus(menuHijo, html);
			}
			
			html.append("</ul>");
			
		}
		return html;
	}

}
