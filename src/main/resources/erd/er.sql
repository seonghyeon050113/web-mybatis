SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS BOARD_INFO;
DROP TABLE IF EXISTS USER_INFO;




/* Create Tables */

CREATE TABLE BOARD_INFO
(
	BI_NUM int NOT NULL AUTO_INCREMENT,
	BL_TITLE varchar(200) NOT NULL,
	BI_CONTENT text NOT NULL,
	CREDAT char(8) DEFAULT 'DATE_FORMAT(NOW(), %Y%m%d)',
	CRETIM char(6) DEFAULT 'DATE_FORMAT(NOW(), %H%i%s)',
	-- 유저 인포의 변화값
	UI_NUM int NOT NULL COMMENT '유저 인포의 변화값',
	PRIMARY KEY (BI_NUM),
	UNIQUE (UI_NUM)
);


CREATE TABLE USER_INFO
(
	-- 유저 인포의 변화값
	UI_NUM int NOT NULL AUTO_INCREMENT COMMENT '유저 인포의 변화값',
	-- 이름
	-- 
	UI_NAME varchar(20) NOT NULL COMMENT '이름
',
	-- 아이디
	UI_ID varchar(20) NOT NULL COMMENT '아이디',
	-- 비밀번호
	UI_PWD varchar(50) NOT NULL COMMENT '비밀번호',
	UI_AGE tinyint DEFAULT 0 NOT NULL,
	-- 전화번호
	-- 
	UI_PHONE char(11) NOT NULL COMMENT '전화번호
',
	-- 주소
	UI_ADDRESS varchar(200) COMMENT '주소',
	-- 성별
	-- 
	UI_TRANS char(1) DEFAULT '1' NOT NULL COMMENT '성별
',
	PRIMARY KEY (UI_NUM),
	UNIQUE (UI_NUM)
);



/* Create Foreign Keys */

ALTER TABLE BOARD_INFO
	ADD FOREIGN KEY (UI_NUM)
	REFERENCES USER_INFO (UI_NUM)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



