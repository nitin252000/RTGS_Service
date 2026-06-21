package com.loanflow.rtgsservice.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.Key;
import java.util.Date;
@Component
public class JwtUtil  {


private final String SECRET="mysecretkeymysecretkeymysecretkey";
private final Key key= Keys.hmacShaKeyFor(SECRET.getBytes());
public String generateToken(String username){
    return Jwts.builder().setSubject(username)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis()+
            1000*60*60)).signWith(key).compact();
}
public String extractUSername(String token){
    return Jwts.parserBuilder().
            setSigningKey(key)
            .build()
            .parseClaimsJws(token)
            .getBody()
            .getSubject();
}
public boolean validateToken(String token){
    try{
        extractUSername(token);
        return true;
    }catch(Exception e){
        return false;
    }
}
}
