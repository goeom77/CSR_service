package com.gyu.csr.web.homepage.controller;

import ch.qos.logback.core.model.Model;
import com.gyu.csr.web.homepage.vo.AuthVo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
//    @GetMapping("/login")
//    public String loginPage(HttpServletRequest request, AuthVo auth) {
//        // 선택적으로 전달된 lang 파라미터는 LocaleChangeInterceptor가 처리함
//        // 추가로 보여줄 메시지나 리턴 URL 등이 있으면 model에 담아 보낼 수 있음
//        return "web/login"; // templates/login.html
//    }
//
//    @PostMapping("/login")
//    public String doLogin(String loginId, String password, String lang, AuthVo auth) {
//        // 실제 인증 로직은 여기서 수행 (예: UserService 호출)
//        // 데모용으로 단순히 아이디만 모델에 담아 이동
////        model.addAttribute("loginId", loginId);
//        // 보안상 절대 비밀번호를 로그/뷰에 노출하지 마세요.
//        // 인증 성공 시 리다이렉트(예: /dashboard) 혹은 실패 시 다시 로그인 폼
//        // 여기서는 성공으로 가정하고 간단히 welcome 페이지(또는 index)로 이동
//        return "redirect:/"; // 성공 시 루트로 이동
//    }
}
