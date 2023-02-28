package com.halfacode.Springintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDevopsController {

    @GetMapping("/get")
    public String getMessage(){
        return "welcome to halfastore";

    }

}
