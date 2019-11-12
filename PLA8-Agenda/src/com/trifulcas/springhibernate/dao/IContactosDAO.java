package com.trifulcas.springhibernate.dao;

import java.util.List;

import com.trifulcas.springhibernate.entity.Contactos;

public interface IContactosDAO {
	List<Contactos> getContactos();

	void save(Contactos contactos);
	
	Contactos getContactos(int idcontacto);

	void delete(Contactos contactos);
}
