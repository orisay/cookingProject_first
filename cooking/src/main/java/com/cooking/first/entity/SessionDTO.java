package com.cooking.first.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SessionDTO {
	private String id;
	private String nickname;
	private int roleNum;

}
