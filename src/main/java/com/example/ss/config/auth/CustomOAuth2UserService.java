package com.example.ss.config.auth;

import com.example.ss.Domain.UsersEntity;
import com.example.ss.Domain.UsersRepository;
import com.example.ss.config.auth.dto.OAuthAttributes;
import com.example.ss.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.Collections;

@RequiredArgsConstructor
@Service
public class CustomOAuth2UserService implements OAuth2UserService<OAuth2UserRequest, OAuth2User> {
    private final UsersRepository usersRepository;
    private final HttpSession httpSession;

    @Override
    public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {

        OAuth2UserService<OAuth2UserRequest,OAuth2User> delegate = new DefaultOAuth2UserService();

        OAuth2User oAuth2User = delegate.loadUser(userRequest);

        //현재 로그인 진행중인 서비스 구분 코드 (네이버인지, 구글인지)
        String registrationId = userRequest.getClientRegistration().getRegistrationId();

        //OAuth2 로그인시 키가 되는 필드값 (pk와 같은의미)
        // 구글은 기본코드 지원 'sub' 네이버,카카오는 미지원
        // 이후 네이버, 구글 동시지원시 사용
        String userNameAttributeName =
                userRequest
                        .getClientRegistration().getProviderDetails().getUserInfoEndpoint().getUserNameAttributeName();


        //OAuth2UserService를 통해 가져온 OAuth2User의 attribute를 담을 클래스
        //이후 다른 소셜로그인도 사용
        OAuthAttributes attributes = OAuthAttributes.of(registrationId, userNameAttributeName, oAuth2User.getAttributes());

        UsersEntity user = saveOrUpdate(attributes);

        //세션에 사용자정보를 저장하기위한 dto 클래스
        httpSession.setAttribute("user",new SessionUser(user));

        return new DefaultOAuth2User(Collections.singleton(new SimpleGrantedAuthority(user.getRoleKey())),
                attributes.getAttributes(),
                attributes.getNameAttributeKey());

    }

    //소셜 사용자 정보가 업데이트 되었을때를 대비하여 업데이트 기능 구현
    //사용자의 이름이라 프로필이 변경되면 usersEntity에도 반영됨
    private UsersEntity saveOrUpdate(OAuthAttributes attributes){
        UsersEntity user = usersRepository.findById(attributes.getId())
                            .map(entity -> entity.update(attributes.getName(), attributes.getProfile()))
                            .orElse(attributes.toEntity());

            return usersRepository.save(user);
    }
}
