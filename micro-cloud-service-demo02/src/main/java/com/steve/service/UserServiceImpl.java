package com.steve.service;

import org.springframework.stereotype.Service;

/**
 * Created by SteveJobson on 2017/9/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "service demo02222  hello:"+name;
    }
}
