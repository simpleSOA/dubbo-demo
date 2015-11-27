package com.fotor.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fotor.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Reference(version = "1.0.0")
    private UserService userService;

    @RequestMapping(value = "/greet")
    @ResponseBody
    public String test1(String name){
        return userService.findUserByName(name);
    }
}
