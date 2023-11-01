package com.cooking.first.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class ReplyDTO {
	// 댓글 번호
	private int rplNum;

	// 게시글 번호
	private int boardNum;

	// 작성자
	private String creator;

	// 댓글 내용
	private String rplContent;

	// 뎁스
	private int depth;


	// 수정 이름
	private String upName;

}
