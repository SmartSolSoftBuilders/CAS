package com.generalseguros.seguridad;

import java.io.Serializable;

import com.generalseguros.dto.BitacoraUsuario;

public interface IRegistable extends Serializable {
	
	void insertarBitacora(BitacoraUsuario bitacora);

}
