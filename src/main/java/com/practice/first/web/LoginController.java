package com.practice.first.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Descriptin : 로그인을 담당할 클래스
 */
@RestController
public class LoginController {

    @GetMapping("/login")
    public void login(){

        // 1. 로그인 구현해야함

    }

}
