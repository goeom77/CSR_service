package com.gyu.csr.web.homepage.entity;

import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
public class CustomUserDetails implements UserDetails {
    private final TbZzUser userDetailTbZzUser;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(
                new SimpleGrantedAuthority(userDetailTbZzUser.getTbZzUserRole().name())
        );
    }

    @Override
    public @Nullable String getPassword() {
        return userDetailTbZzUser.getPassword();
    }

    @Override
    public String getUsername() {
        return userDetailTbZzUser.getEmail();
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return userDetailTbZzUser.isEnabled();
    }
}
