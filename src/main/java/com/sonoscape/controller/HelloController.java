package com.sonoscape.controller;

import com.sonoscape.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("hello")
public class HelloController {

    @Autowired
    private IHelloService helloService;

    @GetMapping("sayHi")
    @ResponseBody
    public String sayHi(@RequestParam String name){
        helloService.sayHi(name);
        return "hhhh";
    }

}
