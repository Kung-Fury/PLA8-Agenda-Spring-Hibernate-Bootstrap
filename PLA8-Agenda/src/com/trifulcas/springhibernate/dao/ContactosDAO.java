package com.trifulcas.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trifulcas.springhibernate.entity.Contactos;


@Repository
public class ContactosDAO implements IContactosDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Contactos> getContactos() {
		Session miSesion=sessionFactory.getCurrentSession();
		
		List<Contactos> contactos=miSesion.createQuery("from Contactos",Contactos.class).list();
		return contactos;
	}

	@Override
	public void save(Contactos contactos) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(contactos);
	}
	
	@Override
	public Contactos getContactos(int idcontacto) {
		Session miSesion=sessionFactory.getCurrentSession();
		return miSesion.get(Contactos.class, idcontacto);
	}

	@Override
	public void delete(Contactos contactos) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.delete(contactos);
	}
}