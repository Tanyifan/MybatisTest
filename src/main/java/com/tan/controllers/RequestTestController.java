package com.tan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TanYf.
 * @project
 * @illu
 * @date 2018/11/16
 */
@Controller
public class RequestTestController {
    @RequestMapping(value = "/RequestTest",method = RequestMethod.GET)
    public String TestString(){
        return "home";
    }
}
