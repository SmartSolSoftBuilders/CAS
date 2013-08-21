package com.generalseguros.seguridad.bo;

import static com.generalseguros.db.CommonDB.tryToTrim;
import static com.generalseguros.dto.Usuario.CORREO_ELECTRONICO;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.generalseguros.comun.SSOMailer;
import com.generalseguros.comun.SSOStringUtils;
import com.generalseguros.db.CommonDB;
import com.generalseguros.dto.Usuario;
import com.generalseguros.seguridad.IModificaContrasena;

public class ModificaContrasenaImpl implements IModificaContrasena {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5803955196646195391L;

	@Override
	public Usuario execute(Usuario usuario) {
		
		String nuevaContrasena = SSOStringUtils.getRandomString();
		
		// Obtener correo
		CommonDB db = new CommonDB();
		
		try {
			ResultSet rs = db.executePreparedStatementQuery(
					OBTENER_CORREO_QUERY, new Object[]{usuario.getNombreUsuario()});
			
			String correoElectronico = null;
			while (rs.next()) {
				correoElectronico = tryToTrim(rs
						.getString(CORREO_ELECTRONICO));
			}
			
			if(correoElectronico == null){
				
				usuario.setMensaje("ERROR: No se puede regenerar la contraseña; el usuario no cuenta con correo electrónico o usuario no activo.");
				
				return usuario;
				
			}else{
				// Enviar correo
				
				usuario.setCorreoElectronico(correoElectronico);
				String mensajeEnvio= enviarCorreo(correoElectronico, nuevaContrasena);
				
				if( mensajeEnvio != null){
					usuario.setMensaje(String.format("ERROR: %s", mensajeEnvio));
					
					return usuario;
				}
			}
			
			nuevaContrasena = SSOStringUtils.getMD5String(nuevaContrasena);
			
			db.executePreparedStatementUpdate(CAMBIAR_CONTRASENA_QUERY,
					new Object[] { nuevaContrasena, usuario.getNombreUsuario() });
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			db.closeResources();
		}
		return usuario;
	}
	
	private String enviarCorreo(String destinatario, String nuevaContrasena){
		String mensajeUsuario = "";
		
		String contenidoEmail = String.format("Su nueva contraseña para ingresar al sistema es: %s", nuevaContrasena);
		
		SSOMailer mailer = new SSOMailer();
		
		try {
			mailer.enviarCorreo(destinatario, contenidoEmail);
			mensajeUsuario = null;
		} catch (AddressException e) {
			mensajeUsuario = "Direccion inexistente o incorrecta";
			e.printStackTrace();
		} catch (MessagingException e) {
			mensajeUsuario = mensajeUsuario + "\n Ocurrió un error al intentar enviar el correo electrónico.";
			e.printStackTrace();
		}
		
		return mensajeUsuario;
	}

}
