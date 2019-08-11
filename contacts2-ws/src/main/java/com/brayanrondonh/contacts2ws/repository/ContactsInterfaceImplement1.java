package com.brayanrondonh.contacts2ws.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.brayanrondonh.contacts2ws.Contacts2WsApplication;

@Repository
@Qualifier(value = "persona1")
public class ContactsInterfaceImplement1 implements ContactsInterface
{
	private static Logger log = LoggerFactory.getLogger(Contacts2WsApplication.class);
	
	public void registrar(String nombre)
	{
		log.info("Se registro a "+nombre);
	}
}
