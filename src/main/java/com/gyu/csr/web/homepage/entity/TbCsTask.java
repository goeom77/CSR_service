package com.gyu.csr.web.homepage.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cs_task")
public class TbCsTask {
    @Id
    @GeneratedValue()
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_zz_client_id")
    private TbZzClient tbZzClient;

    @Column(nullable = false, unique = true)
    private String taskNo;

    private String title;

    private String content;

    private String problem;

    private String result;

}
