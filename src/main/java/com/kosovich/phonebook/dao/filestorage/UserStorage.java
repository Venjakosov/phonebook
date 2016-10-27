package com.kosovich.phonebook.dao.filestorage;

import com.kosovich.phonebook.entity.User;

import java.util.List;

class UserStorage {

    private List<User> users;

    public UserStorage(List<User> users) {
        this.users = users;
    }

    UserStorage() {
    }

    List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
