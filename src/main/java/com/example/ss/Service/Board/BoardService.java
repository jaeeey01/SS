package com.example.ss.Service.Board;

import com.example.ss.DTO.BoardDTO;
import com.example.ss.Domain.BoardEntity;
import com.example.ss.Domain.UsersEntity;

public interface BoardService {

    Long write (BoardDTO dto);

    default BoardEntity dtoToEntity(BoardDTO dto){

        UsersEntity userId = UsersEntity.builder().id(dto.getBWriter()).build();

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
