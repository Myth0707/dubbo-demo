package com.myth.dubbo.service;

import java.util.List;


public class DemoServiceImpl implements DemoService {

    //@Override
    public String sayHello(String name) {
        System.out.println("Hello " + name);
        return "Hello " + name;
    }

    //@Override
    public List getUsers() {
        // TODO Auto-generated method stub
        return null;
    }

}
