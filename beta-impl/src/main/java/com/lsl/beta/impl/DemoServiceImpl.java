package com.lsl.beta.impl;

import com.lsl.beta.api.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "hello world!";
    }
}
