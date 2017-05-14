package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by tarit on 2017. 05. 13..
 */
@Controller
public class SampleController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String index() {
        return "index.html";
    }
}