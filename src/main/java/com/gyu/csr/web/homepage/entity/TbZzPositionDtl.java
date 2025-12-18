package com.gyu.csr.web.homepage.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "tb_zz_position_dtl")
public class TbZzPositionDtl {
    @Id
    @GeneratedValue
    private Long id;

    // 팀장, 파트장, PL 등
    @Column(nullable = false, unique = true)
    private String name;
}