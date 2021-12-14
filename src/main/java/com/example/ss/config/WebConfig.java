package com.example.ss.config;

import com.example.ss.config.auth.LoginUserArgumentResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
    //스프링에서 LoginUserArgumentResolver가 인식될 수 있도록  WebMvcConfigurer 에 추가
    private final LoginUserArgumentResolver loginUserArgumentResolver;

    //HandlerMethodArgumentResolver는 항상 WebMvcConfigurer의 addArgumentResolvers()를 통해 추가해야함
    //다른 Handler-MethodArgumentResolver가 필요하다면 같은방식으로 추가
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(loginUserArgumentResolver);
    }

}
