package com.ws.boot01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("info")
    public String info(){
        //开发人员修改第一次
        return "hello SpringBoot info";
    }
}
