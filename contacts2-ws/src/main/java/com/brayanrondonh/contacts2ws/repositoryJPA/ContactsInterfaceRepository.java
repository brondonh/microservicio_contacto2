package com.brayanrondonh.contacts2ws.repositoryJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brayanrondonh.contacts2ws.model.Contacts;

public interface ContactsInterfaceRepository extends JpaRepository<Contacts, Integer>
{

}
