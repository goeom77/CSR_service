package com.gyu.csr.web.homepage.vo.request;

import com.gyu.csr.web.homepage.entity.TbZzUserRole;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;


public record CreateUserRequest(
        @NotBlank(message = "이메일은 필수 입력 항모입니다.")
        @Email(message = "유효하지 않은 이메일 형식입니다.")
        String email,
        @NotNull
        String password,
        String connectEmail,
        String connectPhone,
        String department,
        @NotNull
        TbZzUserRole userRole
) {
}
