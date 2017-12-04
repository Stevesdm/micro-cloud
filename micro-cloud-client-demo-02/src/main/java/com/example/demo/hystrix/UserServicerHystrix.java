package com.example.demo.hystrix;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by SteveJobson on 2017/9/15.
 */
@Component
public class UserServicerHystrix implements UserService {
    @Override
    public String sayHello(@RequestParam(value = "name") String name) {
        return "sorry" + name + "this service destoryed ,please try again later";
    }
}
