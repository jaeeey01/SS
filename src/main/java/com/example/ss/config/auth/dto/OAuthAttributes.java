package com.example.ss.config.auth.dto;

import com.example.ss.Domain.Role;
import com.example.ss.Domain.UsersEntity;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributeKey;
    private String name;
    private String id;
    private String profile;

    @Builder
    public OAuthAttributes(Map<String, Object>attributes, String nameAttributeKey, String name, String id, String profile){
        this.attributes = attributes;
        this.name = name;
        this.id = id;
        this.profile = profile;
    }

    //OAuth2User에서 반환하는 사용자정보는 Map 이기 때문에 값을 하나하나 반환해야함
    public static OAuthAttributes of(String registrationId, String userNameAttributeName, Map<String, Object>attributes){
        return ofGoogle(userNameAttributeName, attributes);
    }

    private static OAuthAttributes ofGoogle(String userNameAttributeName, Map<String, Object> attributes){
        return OAuthAttributes.builder()
                                .name((String) attributes.get("name"))
                                .id((String) attributes.get("id"))
                                .profile((String) attributes.get("profile"))
                                .attributes(attributes)
                                .nameAttributeKey(userNameAttributeName)
                                .build();
    }

    //UsersEntity를 생성
    //OAuthAttributes에서 엔티티를 생성하는 시점은 첫 가입시
    //가입시 기본권한을 GUEST로 주기위해서 role빌더 값에는 Role.GUEST를 사용
    public UsersEntity toEntity(){
        return UsersEntity.builder()
                            .name(name)
                            .id(id)
                            .profile(profile)
                            .role(Role.GUEST)
                            .build();
    }
}
