package com.trifulcas.springhibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.trifulcas.springhibernate.entity.Contactos;
import com.trifulcas.springhibernate.service.IContactosService;

@Controller
public class InicioController {
	
	@Autowired
	private IContactosService contactosService;

	@RequestMapping("/")
	public String lista(Model modelo) {
		List<Contactos> contactos=contactosService.getContactos();
		
		modelo.addAttribute("contactos",contactos);
		return "lista-contactos";
	}
}

