package com.gyu.csr.web.homepage.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.context.i18n.SimpleLocaleContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@Controller
@RequiredArgsConstructor
public class HomepageController {

    private final LocaleResolver sessionLocaleResolver;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "메인 페이지");
        model.addAttribute("message", "Spring Boot + Thymeleaf 웹사이트 구조 예제");
        return "web/home";
    }
    @GetMapping("/login")
    public String loginPage() {
        return "web/login";
    }
    @PostMapping("/login/error/clear")
    public String clearLoginError(HttpSession session) {
        session.removeAttribute("loginError");
        return "redirect:/login";
    }

    @GetMapping("/change-settings")
    public String changeSettings(
            @RequestParam("lang") String lang,
            HttpServletRequest request,
            HttpServletResponse response
    ) {
        Locale locale = new Locale(lang);
        if (sessionLocaleResolver instanceof SessionLocaleResolver sessionLocaleResolver) {
            sessionLocaleResolver.setLocaleAttributeName("korea");
            sessionLocaleResolver.setLocaleContext(request, response, new SimpleLocaleContext(locale));
        }
        return "redirect:/";
    }
    @GetMapping("/get-session")
    public String getSessionInfo(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String userPreferredLocale = String.valueOf(session.getAttribute("korea"));
        return userPreferredLocale != null ? userPreferredLocale : Locale.ENGLISH.getLanguage();
    }
}
