package com.generalseguros.comun;

import java.io.Serializable;


import com.generalseguros.db.CommonDB;
import com.generalseguros.seguridad.IModificaContrasena;
import com.generalseguros.seguridad.IObtenPermisos;
import com.generalseguros.seguridad.IObtenUsuario;
import com.generalseguros.seguridad.IValidaUsuario;
import com.generalseguros.seguridad.bo.ModificaContrasenaImpl;
import com.generalseguros.seguridad.bo.ObtenPermisosDBImpl;
import com.generalseguros.seguridad.bo.ObtenUsuarioDBImpl;
import com.generalseguros.seguridad.bo.ValidaUsuarioDBImpl;
import static com.generalseguros.db.CommonDB.MESES_CADUCA_PASSWORD;
import static com.generalseguros.db.CommonDB.MESES_CADUCA_SOPORTADO;

public class FactoryBO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5126858634062555139L;
	
	public final static FactoryBO FactoryBI = new FactoryBO();
	
	private FactoryBO(){
	}
	
	public IValidaUsuario createValidaUsuario(){
		
		String nMeses = CommonDB.getPropertyValue(MESES_CADUCA_PASSWORD);
		Boolean mesesCaducaSoportado = new Boolean(CommonDB.getPropertyValue(MESES_CADUCA_SOPORTADO));
		
		return new ValidaUsuarioDBImpl(nMeses, mesesCaducaSoportado);
		
	}
	
	public IObtenUsuario createObtenUsuario(){
		return new ObtenUsuarioDBImpl();
	}

	public IObtenPermisos createObtenPermisos() {
		return new ObtenPermisosDBImpl();
	}
	
	public IModificaContrasena createModificaContrasena() {
		return new ModificaContrasenaImpl();
	}

}
