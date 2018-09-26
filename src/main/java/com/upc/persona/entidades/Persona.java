package com.upc.persona.entidades;

import java.io.Serializable;

public class Persona implements Serializable{

	
	
	/**
	 * 384
	 */
	private static final long serialVersionUID = 33023284426512943L;
	
	private Long codigo;
	private String Nombre;
	private String ApellPa;
	private String ApellMa;
	private String dni;
	private String Grado;
	private String Seccion;
	private int Edad;
	private String Direccion;
	private int Ubigeo;
	private int Estado;
	private String respuesta;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellPa() {
		return ApellPa;
	}
	public void setApellPa(String apellPa) {
		ApellPa = apellPa;
	}
	public String getApellMa() {
		return ApellMa;
	}
	public void setApellMa(String apellMa) {
		ApellMa = apellMa;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getGrado() {
		return Grado;
	}
	public void setGrado(String grado) {
		Grado = grado;
	}
	public String getSeccion() {
		return Seccion;
	}
	public void setSeccion(String seccion) {
		Seccion = seccion;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getUbigeo() {
		return Ubigeo;
	}
	public void setUbigeo(int ubigeo) {
		Ubigeo = ubigeo;
	}
	public int getEstado() {
		return Estado;
	}
	public void setEstado(int estado) {
		Estado = estado;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	
	
}
