//package com.gyu.csr.web.comm.message;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.LocaleResolver;
//import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
//import org.springframework.web.servlet.i18n.SessionLocaleResolver;
//
//import java.util.Locale;
//
//@Configuration
//public class MessageHandler {
//    // Cookie는 httponly 이용할수 있지만 db에 저장할거면 session이 나은듯
////    @Bean
////    public LocaleResolver localeResolver() {
////        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
////        localeResolver.setDefaultLocale(Locale.KOREA);
////        return localeResolver;
////    }
////
////    @Bean
////    public LocaleChangeInterceptor localeChangeInterceptor() {
////        LocaleChangeInterceptor locale = new LocaleChangeInterceptor();
////        locale.setParamName("lang");
////        return locale;
////    }
//
//}
