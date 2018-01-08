package com.example.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @项目：test
 * @创建者：linmin
 * @创建时间：2017/12/27
 * @公司：汽车易生活
 */

@Aspect
@Component
public class HttpAdvice {

    @Before("execution(public * com.example.controller.UserController.*(..))")
    public void beforeRequest(JoinPoint joinPoint){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

    }
}
