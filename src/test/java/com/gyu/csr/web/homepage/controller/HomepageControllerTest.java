package com.gyu.csr.web.homepage.controller;

import com.gyu.csr.web.config.PasswordConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootTest
class HomepageControllerTest {
    @Autowired
    PasswordEncoder encoder;

    @Test
    void encode() {

        System.out.println(encoder.encode("1234"));
    }

}