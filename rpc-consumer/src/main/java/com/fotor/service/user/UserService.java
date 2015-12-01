package com.fotor.service.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fotor.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference(version = "1.0.0")
    private com.fotor.service.UserService userService;

    public User findUserByName(String name){
        return userService.findUserByName(name);
    }
}
