package com.brayanrondonh.contacts2ws.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contacts
{
	@Id
	@GeneratedValue
	private int idPersona;
	private String nombre;
	
	public int getIdPersona()
	{
		return idPersona;
	}
	
	public void setIdPersona(int idPersona)
	{
		this.idPersona = idPersona;
	}
	
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	@Override
	public String toString()
	{
		return "Contacts [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
	
}
