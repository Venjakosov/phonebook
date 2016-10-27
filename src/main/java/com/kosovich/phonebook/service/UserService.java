package com.kosovich.phonebook.service;

import com.kosovich.phonebook.entity.User;
import com.kosovich.phonebook.exception.UserDuplicateException;

public interface UserService {

    User register(User user) throws UserDuplicateException;

    User findUserByUsername(String username);

    User findUserById(Long userId);
}
