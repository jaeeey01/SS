package com.example.ss.Domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;


@Entity
@Getter
@Builder
@NoArgsConstructor
public class UsersEntity extends BaseEntity {

    @Id
    private String id;

    @Column(nullable = false)
    private String name;

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

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Builder
    public UsersEntity(String id, String name, String gender, String nickname, String phone, String intro, String adr, String adr1, String disable, String profile, String block, Role role){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.nickname = nickname;
        this.phone = phone;
        this.intro = intro;
        this.adr = adr;
        this.adr1 = adr1;
        this.disable = disable;
        this.profile = profile;
        this.block = block;
        this.role = role;
    }

    public UsersEntity update(String name, String profile){
        this.name = name;
        this.profile = profile;
        return this;
    }
    public String getRoleKey(){
        return this.role.getKey();
    }
}
