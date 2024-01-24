package com.emp.controller;

import com.emp.feign.DEPTClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

    @Autowired
    DEPTClient deptClient;


    @GetMapping(value = "/get")
    public String get(){
        return "EMP-Ramesh and "+deptClient.getDept();
    }
}
