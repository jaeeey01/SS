package com.example.ss.config.auth.dto;

import com.example.ss.Domain.UsersEntity;
import lombok.Getter;

@Getter
public class SessionUser {      //인증된 사용자 정보만 필요
    private String name;
    private String id;
    private String profile;

    public SessionUser(UsersEntity user){
        this.name = user.getName();
        this.id = user.getId();
        this.profile = user.getProfile();
    }
}
