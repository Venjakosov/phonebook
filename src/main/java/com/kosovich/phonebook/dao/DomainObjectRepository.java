package com.kosovich.phonebook.dao;

import com.kosovich.phonebook.exception.PhoneNumberDuplicateException;
import com.kosovich.phonebook.exception.UserDuplicateException;

public interface DomainObjectRepository<T> {
    T add(T domainObject) throws PhoneNumberDuplicateException, UserDuplicateException;

    void remove(T domainObject);

    T update(T domainObject);

    T findOneById(long id);
}
