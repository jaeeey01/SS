package com.example.ss.Common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {

    @GetMapping(value="/test")
        public String test (){

        return "hello";
        }

}
