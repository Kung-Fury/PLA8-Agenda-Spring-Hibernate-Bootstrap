package com.trifulcas.springhibernate.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.trifulcas.springhibernate.dao.IContactosDAO;
import com.trifulcas.springhibernate.entity.Contactos;

@Service
public class ContactosService implements IContactosService {
	@Autowired
	private IContactosDAO contactosDAO;
	
	@Override
	@Transactional
	public List<Contactos> getContactos() {
		
		return contactosDAO.getContactos();
	}

	@Override
	@Transactional
	public void save(Contactos contactos) {
		contactosDAO.save(contactos);
	}
	
	@Override
	@Transactional
	public Contactos getContactos(int idcontacto) {
		
		return contactosDAO.getContactos(idcontacto);
	}

	@Override
	@Transactional
	public void  delete(Contactos contactos) {
		contactosDAO.delete(contactos);
	}
}
