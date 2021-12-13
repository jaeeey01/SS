package com.example.ss.Controller.User;


import com.example.ss.Service.Users.UsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(value="/users/api")
public class UsersController {

    private final UsersService uSvc;

    @PostMapping("/signup")
    public void signup(){

    }
}
