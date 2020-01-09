package cn.yzy.feign.service;

import cn.yzy.feign.rpc.GetHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    private GetHello getHello;

    public String sayHello(String name){
        return getHello.sayHello(name);
    }
}
