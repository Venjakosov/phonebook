package com.kosovich.phonebook.dao;

import com.kosovich.phonebook.entity.User;

public interface UserRepository extends DomainObjectRepository<User> {

    User getUserByUsername(String username);
}
