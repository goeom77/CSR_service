package com.gyu.csr.web.homepage.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class HomepageControllerTest {
    @Autowired
    PasswordEncoder encoder;

    @Test
    void passwordEncode() {
        // value
        String rawPassword = "1234";
        String encodedPassword = encoder.encode(rawPassword);

        // 원문과 다르다 (암호화 됐는지)
        assertNotEquals(rawPassword, encodedPassword);

        // BCrypt 포맷이다
        assertTrue(encodedPassword.startsWith("$2"));

        // 검증
        assertTrue(encoder.matches(rawPassword, encodedPassword));
    }

}