package com.trifulcas.springhibernate.service;

import java.util.List;
import com.trifulcas.springhibernate.entity.Contactos;

public interface IContactosService {
	List<Contactos> getContactos();

	void save(Contactos contactos);
	
	Contactos getContactos(int idcontacto);

	void delete(Contactos idcontacto);
}
