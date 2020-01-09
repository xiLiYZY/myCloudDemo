package cn.yzy.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){

        return restTemplate.getForObject("http://localhost:8082/hello/"+name,String.class);
    }
}

