package com.sonoscape.service.impl;

import com.sonoscape.IHelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements IHelloService {
    @Override
    public void sayHi(String name) {
        System.out.println("hello\t" + name);
    }
}
