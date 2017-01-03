package com.ciberdix;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rol {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	Long CogigoRol;
	String Rol;
	public Long getCogigoRol() {
		return CogigoRol;
	}
	public void setCogigoRol(Long cogigoRol) {
		CogigoRol = cogigoRol;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}

}
