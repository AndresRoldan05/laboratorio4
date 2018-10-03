package com.apidemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Materia {
	
	@Id
	@Column(name="ID")
	private int idm;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="PROFESOR")
	private int profesor;
	@Column(name="CURSO")
	private int curso;
	
	
	public int getIdm() {
		return idm;
	}
	public void setIdm(int idm) {
		this.idm = idm;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProfesor() {
		return profesor;
	}
	public void setProfesor(int profesor) {
		this.profesor = profesor;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}

}
