package com.gaussic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lanxum on 2015/11/19.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/test.do", method = RequestMethod.GET)
    public String index() {
        Runnable r2 = () -> System.out.println("Howdy, world!");
        return "index";
    }
}
