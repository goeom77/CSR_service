package com.gyu.csr.web.homepage.entity;

public enum TbZzUserRole {
    ROLE_ADMIN, // manager 가입, 유저 설정 변경에 대한 권한
    ROLE_MANAGER, // company등록, task를 진행 및 생성하고, 처리할수 있는 권한
    ROLE_CSR, // company등록, CSR 등록을 진행할수 있는 권한
    ROLE_USER // 자신의 company 진행사항 및 진행 내역을 확인할수 있는 권한
}