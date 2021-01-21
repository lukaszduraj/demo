package com.brainly.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppMVCController {

    @RequestMapping(value = "/app")
    public String index(){
        return "app";
    }

}
