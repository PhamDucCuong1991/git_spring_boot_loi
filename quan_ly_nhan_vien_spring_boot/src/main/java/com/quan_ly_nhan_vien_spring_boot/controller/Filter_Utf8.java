//package com.quan_ly_nhan_vien_spring_boot.controller;
//
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter({"/create","/edit","/delete"})
//public class Filter_Utf8 extends HttpFilter {
//    @Override
//    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
//        req.setCharacterEncoding("UTF-8");
//        res.setCharacterEncoding("UTF-8");
//        HttpSession httpSession = req.getSession();
//        Account account = (Account) httpSession.getAttribute("account");
//
//        if (account == null){
//            res.sendRedirect("/login");
//        }
//        chain.doFilter(req,res);
//    }
//}
