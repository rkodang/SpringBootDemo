package gundom.springbootdemo01.controller;

import gundom.springbootdemo01.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService service;
    @RequestMapping("hello")
    public String sayHi(String name){
        return "Controller:"+service.sayHi(name);
    }
}
