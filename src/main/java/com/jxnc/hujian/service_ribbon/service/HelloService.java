package com.jxnc.hujian.service_ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;


    //  这里的url 是 eureka_service 里面注册的 ，eureka_client 工程下面的  spring.application.name : hello
    // 大写是因为 配置在服务中心后Application 显示
    public  String sayHello(String name){
        return  restTemplate.getForObject("http://HELLO/hello?name="+name,String.class);
    }


}
