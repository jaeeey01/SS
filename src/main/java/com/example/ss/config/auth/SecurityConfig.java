package com.example.ss.config.auth;

import com.example.ss.Domain.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final CustomOAuth2UserService customerOAuth2UserService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .headers().frameOptions().disable()//h2-console 화면을 사용하기 위해 해당옵션 disable
                .and()
                    .authorizeHttpRequests()        //URL별 권한관리 설정 옵션 시작

                    //권한관리대상 지정옵션  url, http메소드별 관리 가능
                    .antMatchers("/","/css/**","/images/**","/js/**","h2-console/**").permitAll() // '/' 등 지정된 url은 전체연람권한
                    .antMatchers("/api/**").hasRole(Role.USER.name())// '/api/**' 주소를 가진 api는 user권한 가진사람만 가능
                    .anyRequest().authenticated()//설정된 값들 이외 나머지 url 은 인증이 된 사용자만 가능
                .and()
                    .logout()
                        .logoutSuccessUrl("/") //로그아웃 기능에 대한 설정 시작 로그아웃 성공시 '/'로 이동
                .and()
                    .oauth2Login()  //로그인 설정 시작
                        .userInfoEndpoint() //로그인 성공 이후 사용자 정보 가져올 설정 담당
                            .userService(customerOAuth2UserService);//로그인 성공시 후속 조치 진행할 인터페이스 구현체 등록
                                                                    //리소스 서버(소셜 서비스)에서 사용자 정보를 가져온 상태에서 추가 기능 명시 가능


    }


}
