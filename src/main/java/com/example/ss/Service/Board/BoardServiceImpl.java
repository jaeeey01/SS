package com.example.ss.Service.Board;

import com.example.ss.Domain.BoardDTO;
import com.example.ss.Repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardRepository bRepo;

    @Override
    public Long write(BoardDTO dto) {


        return null;
    }
}