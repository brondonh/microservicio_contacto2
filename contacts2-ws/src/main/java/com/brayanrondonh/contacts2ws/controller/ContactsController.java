package com.brayanrondonh.contacts2ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brayanrondonh.contacts2ws.model.Contacts;
import com.brayanrondonh.contacts2ws.repositoryJPA.ContactsInterfaceRepository;

@Controller
public class ContactsController
{
	@Autowired
	private ContactsInterfaceRepository contactsInterRep;
	
	@GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model)
	{
		Contacts contacts = new Contacts();
		contacts.setNombre("Pamela");
		contactsInterRep.save(contacts);
        return "greeting";
    }
	
	@GetMapping("/listar")
	 public String lista(Model model)
		{			
	        model.addAttribute("name", contactsInterRep.findAll());
	        return "greeting";
	    }
}
