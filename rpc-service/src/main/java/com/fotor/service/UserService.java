package com.fotor.service;


import com.fotor.model.User;

public interface UserService {

    User findUserByName(String name);
}
