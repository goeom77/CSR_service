package com.gyu.csr.web.homepage.repository;

import com.gyu.csr.web.homepage.entity.TbZzUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<TbZzUser, Long> {
    Optional<TbZzUser> findByEmail(String email);
}
