package com.generalseguros.seguridad.bo;

import static com.generalseguros.db.CommonDB.tryToTrim;

import static com.generalseguros.dto.Permisos.TIPO_USUARIO;
import static com.generalseguros.dto.Usuario.NOMBRE_USUARIO;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.generalseguros.db.CommonDB;
import com.generalseguros.dto.TipoUsuario;
import com.generalseguros.dto.Usuario;
import com.generalseguros.seguridad.IObtenUsuario;

public class ObtenUsuarioDBImpl implements IObtenUsuario, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6841326982243564531L;

	@Override
	public Usuario execute(String usuario, String sessionId, boolean bySession) {
		
		CommonDB db = new CommonDB();
		
		Usuario user = new Usuario();
		
		try {
			
			String query = bySession? OBTEN_USUARIO_SESSION: OBTEN_TIPO_USUARIO;
			String param = bySession? sessionId: usuario;
		 
			ResultSet rs  = db.executePreparedStatementQuery(query,new Object[]{param});
			
			while (rs.next()) {
				
				String result = tryToTrim(rs.getString(bySession? NOMBRE_USUARIO: TIPO_USUARIO));
				
				if(bySession)
					user.setNombreUsuario(result);
				else
					user.setTipoUsuario(new TipoUsuario(result));
			
			}
		
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			db.closeResources();
		}
		

		return user;
	}

}
