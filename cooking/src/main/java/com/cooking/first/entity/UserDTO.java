package com.cooking.first.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
	//아이디
	private String id;

	// 비밀번호
	private String pw;

	// 이름
	private String name;

	// 닉네임
	private String nickname;

	// 지역번호
	private String tel1;

	// 전화번호앞자리
	private String tel2;

	// 전화번호뒷자리
	private String tel3;

	// 이메일
	private String email;

	// 도메인
	private String domain;

	// 주소
	private String addr1;

	// 상세주소
	private String addr2;

	// 생성 이름
	private String crtName;

	// 수정 이름
	private String upName;
}
