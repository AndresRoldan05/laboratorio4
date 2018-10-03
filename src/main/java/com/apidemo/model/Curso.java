package com.apidemo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Curso {
	@Id
	@Column(name="ID")
	private int idc;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="PROFESOR")
	private int profesor;
	
	
	public int getIdc() {
		return idc;
	}
	public void setIdc(int idc) {
		this.idc = idc;
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
	
	

}
