package com.generalseguros.seguridad;

import java.io.Serializable;

import com.generalseguros.db.CommonDB;
import com.generalseguros.dto.Permisos;
import com.generalseguros.dto.Sistema;
import com.generalseguros.dto.Usuario;

public interface IObtenPermisos extends Serializable {

	Permisos execute(Usuario usuario, Sistema sistema);
	
	public final static String OBTEN_PERMISOS_QUERY= CommonDB.getPropertyValue("ObtenPermisosQuery");

}
