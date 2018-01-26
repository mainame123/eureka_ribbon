package com.jxnc.hujian.service_ribbon.web;

import com.jxnc.hujian.service_ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping(value = "/sayHi")
    public  String sayHi(@RequestParam String name){

        return  helloService.sayHello(name);
    }

}
