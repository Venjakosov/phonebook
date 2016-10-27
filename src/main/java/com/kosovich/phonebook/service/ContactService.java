package com.kosovich.phonebook.service;

import com.kosovich.phonebook.exception.PhoneNumberDuplicateException;
import com.kosovich.phonebook.entity.Contact;

import java.util.List;

public interface ContactService {

    Contact createNewContact(Contact contact, String username) throws PhoneNumberDuplicateException;

    Contact getContactById(long contactId, String username);

    Contact updateContact(Contact updatedContact);

    List<Contact> getAllContacts(String username);

    void deleteContactById(Long contactId, String username);

    List<Contact> findByRequestedParameters(String firstName, String lastName, String cellPhone, String username);
}
