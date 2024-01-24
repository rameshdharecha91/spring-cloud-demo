package com.dept.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {


    @GetMapping(value = "/get-dept")
    public String get(){
        return "DEPT-IT";
    }
}
