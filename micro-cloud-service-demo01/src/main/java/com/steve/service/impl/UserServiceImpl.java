package com.steve.service.impl;

import com.steve.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by SteveJobson on 2017/9/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String sayHello(String name) {
        return "service demo01  hello:"+name;
    }
}
