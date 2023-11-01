package com.cooking.first.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class BoardDTO {
	 // 게시글 번호
    private Double boardNum;

    // 카테고리 도메인
    private String catDomain;

    // 작성자
    private String creator;

    // 제목
    private String titil;

    // 내용
    private String content;

    // 조회수
    private int hit;

    // 댓글 수
    private int rplCnt;

    // 수정 이름
    private String upName;

}
