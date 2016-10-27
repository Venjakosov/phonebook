package com.kosovich.phonebook.dao;

import com.kosovich.phonebook.entity.Contact;

import java.util.List;

public interface ContactRepository extends DomainObjectRepository<Contact> {

    List<Contact> findAllByUsername(String username);
}
