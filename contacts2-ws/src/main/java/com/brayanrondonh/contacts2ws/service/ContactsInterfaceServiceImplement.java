package com.brayanrondonh.contacts2ws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.brayanrondonh.contacts2ws.repository.ContactsInterface;

@Service
public class ContactsInterfaceServiceImplement implements ContactsInterfaceService
{
	@Autowired
	@Qualifier("persona2")
	ContactsInterface contactsInter;
	
	public void registrar(String nombre)
	{
		contactsInter.registrar(nombre);
	}
}
