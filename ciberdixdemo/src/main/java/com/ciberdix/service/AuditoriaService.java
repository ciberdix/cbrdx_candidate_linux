package com.ciberdix.service;

import java.util.List;

import com.ciberdix.model.Auditoria;
import com.ciberdix.model.Usuarios;

public interface AuditoriaService {

	public void saveAuditoria(String accion, Usuarios usuario);
	public List<Auditoria> findAllAuditorias();
}
