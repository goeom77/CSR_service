package com.gyu.csr.web.homepage.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cs_client")
public class TbZzClient {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "boolean default false")
    private Boolean activeStatus;
}
