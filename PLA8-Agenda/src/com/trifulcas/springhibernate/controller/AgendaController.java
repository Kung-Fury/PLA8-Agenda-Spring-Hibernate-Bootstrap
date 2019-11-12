package com.trifulcas.springhibernate.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trifulcas.springhibernate.entity.Contactos;
import com.trifulcas.springhibernate.service.IContactosService;

@Controller
@RequestMapping("/contactos")
public class AgendaController {
	
							
	
	@Autowired
	private IContactosService contactosService;

	@RequestMapping("/lista")
	public String lista(Model modelo) {
		List<Contactos> contactos=contactosService.getContactos();
		
		modelo.addAttribute("contactos",contactos);
		return "lista-contactos";
	}
	
	@GetMapping("/addcontactos")
	public String addcontactos(Model modelo) {
		Contactos contactos = new Contactos();
		modelo.addAttribute("contactos", contactos);
		return "form-contactos";
	}
	
	@GetMapping("updatecontactos")
	public String updateContactos(@RequestParam("idcontacto") int idcontacto, Model modelo) {

		Contactos contactos = contactosService.getContactos(idcontacto);
		modelo.addAttribute("contactos", contactos);
		return "form-contactos";
	}
	
	@GetMapping("deletecontactos")
	public String deleteContactos(@RequestParam("idcontacto") int idcontacto) {
		Contactos contactos = contactosService.getContactos(idcontacto);
		contactosService.delete(contactos);

		return "redirect:/contactos/lista";
	}
	
	@PostMapping("/savecontactos")
	public String saveContactos(@Valid @ModelAttribute("contactos") Contactos contactos, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form-contactos";
		} else {
			contactosService.save(contactos);
			return "redirect:/contactos/lista";
		}
	}
}
