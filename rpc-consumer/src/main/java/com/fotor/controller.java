package com.fotor;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fotor.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

    @Reference(version ="1.0.0")
    private UserService userService;

    @RequestMapping(value = "/dubbo/helloworld")
    @ResponseBody
    public String helloWorld(String name){
        return userService.findUserByName(name);
    }
}
