package com.steve.rest;

import com.steve.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SteveJobson on 2017/9/15.
 */
@RestController
public class UserRest {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/hello" , method = RequestMethod.GET)
    public String sayHello(
            @RequestParam(value = "name") String name
    ){
        return this.userService.sayHello(name);
    }
}
