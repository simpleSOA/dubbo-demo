package com.fotor.controller;

import com.fotor.model.User;
import com.fotor.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/{name}")
    @ResponseBody
    public User findByName(@PathVariable("name")String name){
        return service.findUserByName(name);
    }

}
