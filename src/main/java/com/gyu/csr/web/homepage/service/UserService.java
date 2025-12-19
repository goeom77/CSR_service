package com.gyu.csr.web.homepage.service;

import com.gyu.csr.web.homepage.entity.TbZzUser;
import com.gyu.csr.web.homepage.repository.UserRepository;
import com.gyu.csr.web.homepage.vo.request.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void createUser(CreateUserRequest request) {
        TbZzUser user = TbZzUser.builder()
                .email(request.email())
                .password(passwordEncoder.encode(request.password()))
                .connectEmail(request.connectEmail())
                .connectPhone(request.connectPhone())
                .department(request.department())
                .enabled(true)
                .tbZzUserRole(request.userRole())
                .build();
        userRepository.save(user);
    }
}
