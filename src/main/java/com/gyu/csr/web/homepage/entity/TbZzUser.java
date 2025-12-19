package com.gyu.csr.web.homepage.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_zz_user")
public class TbZzUser {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String department;

    @Column
    private String connectEmail;

    @Column
    private String connectPhone;

    @Column(columnDefinition = "boolean default false")
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private TbZzUserRole tbZzUserRole;

}
