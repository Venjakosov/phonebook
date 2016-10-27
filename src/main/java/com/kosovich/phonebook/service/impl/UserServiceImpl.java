package com.kosovich.phonebook.service.impl;

import com.kosovich.phonebook.exception.UserDuplicateException;
import com.kosovich.phonebook.dao.UserRepository;
import com.kosovich.phonebook.entity.User;
import com.kosovich.phonebook.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserRepository userRepository;

    public User register(User user) throws UserDuplicateException {
        try {
            return userRepository.add(user);
        } catch (Exception e) {
            throw new UserDuplicateException();
        }
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.getUserByUsername(username);
    }

    @Override
    public User findUserById(Long userId) {
        return userRepository.findOneById(userId);
    }
}
