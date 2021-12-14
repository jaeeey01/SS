package com.example.ss.Service.Users;

import com.example.ss.DTO.UsersDTO;
import com.example.ss.Domain.UsersEntity;

public interface UsersService {
    
    
    default UsersEntity entityToDto(UsersDTO dto){
        
        return UsersEntity.builder()
                            .id(dto.getId())
                            .gender(dto.getGender())
                            .nickname(dto.getNickname())
                            .phone(dto.getPhone())
                            .intro(dto.getIntro())
                            .adr(dto.getAdr())
                            .adr1(dto.getAdr1())
                            .disable(dto.getDisable())
                            .profile(dto.getProfile())
                            .block(dto.getBlock())
                            .build();
    }
    
    default UsersDTO dtoToEntity(UsersEntity entity){
        
        return UsersDTO.builder()
                        .Id(entity.getId())
                        .gender(entity.getGender())
                        .nickname(entity.getNickname())
                        .phone(entity.getPhone())
                        .intro(entity.getIntro())
                        .adr(entity.getAdr())
                        .adr1(entity.getAdr1())
                        .disable(entity.getDisable())
                        .profile(entity.getProfile())
                        .block(entity.getBlock())
                        .build();
    }
}
