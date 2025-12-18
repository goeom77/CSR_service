package com.gyu.csr.web.homepage.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@Table(name = "tb_zz_position_msl")
public class TbZzPositionMsl {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private TbZzUser tbZzUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "position_id")
    private TbZzPositionDtl tbZzPositionDtl;
}
