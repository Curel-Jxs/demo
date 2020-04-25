package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jiangxinsong
 * @create 2020-04-25-16:28
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String sayHello(){
        return "hello";
    }

}
