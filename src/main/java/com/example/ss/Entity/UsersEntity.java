package com.example.ss.Entity;

import com.example.ss.Common.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;


@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersEntity extends BaseEntity {

    @Id
    private String Id;

    @Column
    private String gender;

    @Column
    private String nickname;

    @Column
    private String phone;

    @Column
    private String intro;

    @Column
    private String adr;

    @Column
    private String adr1;

    @ColumnDefault("n")
    private String disable;

    @Column
    private String profile;

    @Column
    @ColumnDefault("n")
    private String block;


}
