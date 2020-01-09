package cn.yzy.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "feign-provider")
public interface GetHello {
    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String sayHello(@PathVariable String name);
}
