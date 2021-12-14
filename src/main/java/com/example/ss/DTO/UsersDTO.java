package com.example.ss.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {

    private String Id;

    private String gender;

    private String nickname;

    private String phone;

    private String intro;

    private String adr;

    private String adr1;

    private String disable;

    private String profile;

    private String block;
}
