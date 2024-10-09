package com.example.pupupprojectserver.domain.User;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SessionUser {
    // 앞으로 외부에 노출되는 데이터는 SessionUser, DB에 전달될 데이터는 User
    private int id;
    // 회원 정보
    private String username;
    private String nickname;
    // 위치 정보
    private double latitude;
    private double longitude;

}
