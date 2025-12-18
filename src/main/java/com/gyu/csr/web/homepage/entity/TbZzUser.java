package com.gyu.csr.web.homepage.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
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
    private String departmentName;

    @Column(columnDefinition = "boolean default false")
    private boolean enabled;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private TbZzDepartmentDtl tbZzDepartmentDtl;

    @Enumerated(EnumType.STRING)
    private TbZzUserRole tbZzUserRole;

}
