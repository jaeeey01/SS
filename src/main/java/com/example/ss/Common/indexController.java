package com.example.ss.Common;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class indexController {

    @GetMapping(value="/")
        public String index (){

        return "/index";
        }

}
