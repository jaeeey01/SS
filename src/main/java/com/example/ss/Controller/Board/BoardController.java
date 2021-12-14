package com.example.ss.Controller.Board;

import com.example.ss.DTO.BoardDTO;
import com.example.ss.Service.Board.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping(value="/api/board")
public class BoardController {

    private final BoardService bSvc;


    @GetMapping(value="/")
    public String index (){

        return "/index";
    }

    @PostMapping(value="/write")
    public void write (BoardDTO dto){



    }
}
