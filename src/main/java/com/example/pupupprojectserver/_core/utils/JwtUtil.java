package com.example.pupupprojectserver._core.utils;

import java.util.Date;

public class JwtUtil {
//    public static String create(User user) {
//        String jwt = JWT.create()
//                .withSubject("popup")
//                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24 * 7)) // 12h 유효
//                .withClaim("id", user.getId())
//                .withClaim("username", user.getUsername())
//                .withClaim("nickname", user.getNickname())
//                .sign(Algorithm.HMAC512("popup")); // 나중에 환경 변수로 변경.
//
//        return jwt;
//    }
//
//    public static SessionUser verify(String jwt) {
//        DecodedJWT decodedJWT = JWT.require(Algorithm.HMAC512("popup")).build().verify(jwt);
//        int id = decodedJWT.getClaim("id").asInt();
//        String username = decodedJWT.getClaim("username").asString();
//        String nickname = decodedJWT.getClaim("nickname").asString();
//
//        return SessionUser.builder()
//                .id(id)
//                .username(username)
//                .nickname(nickname)
//                .build();
//    }
}
