package com.loanflow.rtgsservice.controller;

import com.loanflow.rtgsservice.security.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JwtUtil jwtUtil;
    public AuthController(JwtUtil jwtUtil){
        this.jwtUtil=jwtUtil;
    }
    @PostMapping("/login")
    public Map<String,String> login(){
        String token=jwtUtil.generateToken("niks");
        return Map.of("token",token);//
    }
}
