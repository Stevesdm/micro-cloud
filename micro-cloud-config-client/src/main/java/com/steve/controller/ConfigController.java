package com.steve.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by SteveJobson on 2017/9/16.
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${name}")
    private String name;

    @RequestMapping(value="config")
    public String config(){
        return "hello  " + this.name;
    }
}
