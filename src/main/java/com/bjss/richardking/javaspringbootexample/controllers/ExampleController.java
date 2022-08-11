package com.bjss.richardking.javaspringbootexample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * ExampleController
 * @author Richard King
 * 
 */

@RestController
public class ExampleController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, world!";
    }

}
