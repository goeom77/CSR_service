package com.gyu.csr.web.homepage.vo.request;

import com.gyu.csr.web.homepage.entity.TbZzUser;
import com.gyu.csr.web.homepage.entity.TbZzUserRole;

public record CreateUserRequest(
        String email,
        String password,
        String connectEmail,
        String connectPhone,
        String department,
        TbZzUserRole userRole
) {
}
