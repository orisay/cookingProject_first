package com.cooking.first.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class CategoryDTO {
    // 카테고리 도메인
    private String catDomain;

    // 권한 번호
    private int roleNum;

    // 생성 이름
    private String crtName;

    // 수정 이름
    private String upName;
}
