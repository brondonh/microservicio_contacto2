package com.brayanrondonh.contacts2ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brayanrondonh.contacts2ws.repository.ContactsInterface;
import com.brayanrondonh.contacts2ws.service.ContactsInterfaceService;

@SpringBootApplication
public class Contacts2WsApplication implements CommandLineRunner
{
	private static Logger log = LoggerFactory.getLogger(Contacts2WsApplication.class);
	
	@Autowired
	private ContactsInterfaceService contactsIntSer;
	
	public static void main(String[] args)
	{
		SpringApplication.run(Contacts2WsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		contactsIntSer.registrar("BrayanRondonH..!");
	}

}
