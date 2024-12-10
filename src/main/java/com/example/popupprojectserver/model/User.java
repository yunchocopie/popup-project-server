package com.example.popupprojectserver.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Timestamp;

@NoArgsConstructor
@Data
@DynamicInsert
@Entity
@Table(name = "user_tb")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username; // 로그인 아이디
    private String password;
    private String nickname; // 회원 별명
    @ColumnDefault("true")
    private boolean status; // 계정 상태 (false : 비활성, true : 활성)
    //private String name;
    private String tel; // 전화번호
    private String email;
    //@ColumnDefault("'default/avatar.png'") //TODO : 나중에 upload 파일 생성하기
    //private String imgFilename;
    @CreationTimestamp
    private Timestamp registeredAt; // 가입일

    @Builder
    public User(int id, String username, String password, String nickname, boolean status, /*String name,*/ String tel, String email, /*String imgFilename,*/ Timestamp registeredAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.status = status;
        //this.name = name;
        this.tel = tel;
        this.email = email;
        //this.imgFilename = imgFilename;
        this.registeredAt = registeredAt;
    }
}
