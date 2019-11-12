package com.trifulcas.springhibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.trifulcas.springhibernate.validation.ValidarEmail;
import com.trifulcas.springhibernate.validation.ValidarNombre;
import com.trifulcas.springhibernate.validation.ValidarTelefono;

@Entity
@Table(name = "contactos")
public class Contactos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcontacto")
	private int idcontacto;

	@Column(name = "nombre")
	@ValidarNombre
	private String nombre;

	@Column(name = "email")
	@ValidarEmail
	private String email;

	@Column(name = "telefono")
	@ValidarTelefono
	private String telefono;

	public Contactos() {

	}

	public Contactos(String nombre, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	public int getIdcontacto() {
		return idcontacto;
	}

	public void setIdcontacto(int idcontacto) {
		this.idcontacto = idcontacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Contactos [idcontacto=" + idcontacto + ", nombre=" + nombre + ", email=" + email + ", telefono="
				+ telefono + "]";
	}

}