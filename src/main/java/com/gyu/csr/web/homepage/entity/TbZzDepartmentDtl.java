package com.gyu.csr.web.homepage.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_zz_department_dtl")
public class TbZzDepartmentDtl {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;
}
