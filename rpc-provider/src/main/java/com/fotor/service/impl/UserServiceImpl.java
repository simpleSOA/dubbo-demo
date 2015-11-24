package com.fotor.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.fotor.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public String findUserByName(String name) {
        return "The User name: "+name;
    }
}
