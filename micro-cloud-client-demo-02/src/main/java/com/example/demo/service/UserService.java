package com.example.demo.service;

import com.example.demo.hystrix.UserServicerHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by SteveJobson on 2017/9/15.
 */
@FeignClient(name="spring-cloud-service-demo",fallback = UserServicerHystrix.class)
public interface UserService {

    @RequestMapping(value="/hello" , method = RequestMethod.GET)
    public String sayHello(
            @RequestParam(value = "name") String name
    );
}
