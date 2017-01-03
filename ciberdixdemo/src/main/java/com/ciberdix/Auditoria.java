package com.ciberdix;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import org.hibernate.type.TimestampType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ForeignKey;
import java.sql.Timestamp;


@Entity
public class Auditoria {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long CodigoAuditoria;
	@ManyToOne
	@JoinColumn(name="CodigoUsuario", referencedColumnName="CodigoUsuario")
	private Usuarios usuario;
	String Accion;
	Timestamp Timestamp;
	public Long getCodigoAuditoria() {
		return CodigoAuditoria;
	}
	public void setCodigoAuditoria(Long codigoAuditoria) {
		CodigoAuditoria = codigoAuditoria;
	}
	public Usuarios getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	public String getAccion() {
		return Accion;
	}
	public void setAccion(String accion) {
		Accion = accion;
	}
	public Timestamp getTimestamp() {
		return Timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		Timestamp = timestamp;
	}	
	

}
