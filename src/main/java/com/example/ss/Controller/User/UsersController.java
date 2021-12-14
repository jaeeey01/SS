package com.example.ss.Controller.User;


import com.example.ss.Service.Users.UsersService;
import com.example.ss.config.auth.LoginUser;
import com.example.ss.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(value="/api/users")
public class UsersController {

    private final UsersService uSvc;

    @PostMapping("/login")       //@LoginUser만 사용하면 세션정보 가져올수 있음
    public String login(Model model, @LoginUser SessionUser user){

        //model.addAttribute("uSvc",uSvc.findAllDesc());

        if(user!=null){
            model.addAttribute("userName",user.getName());
        }
        return "index";
    }
}
