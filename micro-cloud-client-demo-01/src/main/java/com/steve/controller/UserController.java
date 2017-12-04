package com.steve.controller;


import com.steve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SteveJobson on 2017/9/15.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/")
    public String userHello(
            @RequestParam String name
    ){
        return this.userService.sayHello(name);
    }

}
