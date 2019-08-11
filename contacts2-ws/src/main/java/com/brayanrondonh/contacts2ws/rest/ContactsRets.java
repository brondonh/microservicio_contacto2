package com.brayanrondonh.contacts2ws.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.brayanrondonh.contacts2ws.model.Contacts;
import com.brayanrondonh.contacts2ws.repositoryJPA.ContactsInterfaceRepository;

@RestController
@RequestMapping("/personas")
public class ContactsRets
{

	@Autowired
	ContactsInterfaceRepository contactsInterRepo;
	
	@GetMapping
	public List<Contacts> listar()
	{
		return contactsInterRepo.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public void buscarId(@PathVariable("id") Integer id)
	{
		contactsInterRepo.findById(id);
	}
	
	@PostMapping
	public void insertar(@RequestBody Contacts contacts)
	{
		contactsInterRepo.save(contacts);
	}
	
	@PutMapping
	public void modificar(@RequestBody Contacts contacts)
	{
		contactsInterRepo.save(contacts);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		contactsInterRepo.deleteById(id);
	}
}
