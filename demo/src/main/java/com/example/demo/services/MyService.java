package com.example.demo.services;

import com.example.demo.components.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent){

        this.myComponent = myComponent;
    }

    public String getName(){

        return myComponent.getMyComponentName();
    }
}
