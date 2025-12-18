package com.gyu.csr.web.homepage.service;

import com.gyu.csr.web.homepage.entity.TbZzUser;
import com.gyu.csr.web.homepage.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomDetailUserService implements UserDetailsService {
    private final UserRepository userRepository;

    // login시 기본 유저 확인
    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        TbZzUser tbZzUser = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(email));


        return User.builder()
                .username(tbZzUser.getEmail())
                .password(tbZzUser.getPassword())
                .authorities(
                        List.of(new SimpleGrantedAuthority(tbZzUser.getTbZzUserRole().name()))
                )
                .disabled(!tbZzUser.isEnabled())
                .build();
    }
}
