-- 더미 작업

INSERT INTO user_tb
(username, password, nickname, name, tel, email, registered_at, img_filename)
VALUES ('user1', '1234', '윤정', '최윤정', '01012345555', 'user1@gmail.com', now(),'default/avatar.png'),
       ('user2', '1234', '아정', '조아정', '01012346666', 'user2@gmail.com', now(),'default/user2.jpg'),
       ('user3', '1234', '세환', '나세환', '01012347777', 'user3@gmail.com', now(),'default/avatar.png'),
       ('user4', '1234', '준현', '박준현', '01012348888', 'user4@gmail.com', now(),'default/avatar.png'),
       ('user5', '1234', '길동', '홍길동', '01012349999', 'user5@gmail.com', now(),'default/user5.jpg');
