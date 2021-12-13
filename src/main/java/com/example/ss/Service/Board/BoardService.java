package com.example.ss.Service.Board;

import com.example.ss.Domain.BoardDTO;
import com.example.ss.Entity.BoardEntity;
import com.example.ss.Entity.UsersEntity;

public interface BoardService {

    Long write (BoardDTO dto);

    default BoardEntity dtoToEntity(BoardDTO dto){

        UsersEntity userId = UsersEntity.builder().Id(dto.getBWriter()).build();

        return BoardEntity.builder()
                            .boNo(dto.getBoNo())
                            .bWriter(userId)
                            .boardTitle(dto.getBoardTitle())
                            .boardContent(dto.getBoardContent())
                            .isDelete(dto.getIsDelete())
                            .block(dto.getBlock())
                            .build();
    }

    default BoardDTO entityToDto(BoardEntity entity){

        return BoardDTO.builder()
                            .boNo(entity.getBoNo())
                            .bWriter(entity.getBWriter().getId())
                            .boardTitle(entity.getBoardTitle())
                            .boardComment(entity.getBoardContent())
                            .isDelete(entity.getIsDelete())
                            .block(entity.getBlock())
                            .build();
    }
}