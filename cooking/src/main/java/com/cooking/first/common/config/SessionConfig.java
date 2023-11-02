package com.cooking.first.common.config;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cooking.first.entity.SessionDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public class SessionConfig {
	//session 얻어오는 함수
	public static HttpSession getSession() {
		HttpServletRequest httpServletRequest = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = httpServletRequest.getSession();
		return session;
	}

	public static SessionDTO getSessionDTO() {
//		HttpSession session = getSession();
//		SessionDTO sessionDTO=(SessionDTO)session.getAttribute(ConstantConfig.USER_INFO);
		SessionDTO sessionDTO = new SessionDTO();
		sessionDTO.setId("admin");
		sessionDTO.setRoleNum(3);
		sessionDTO.setNickname("홍길동");
		return sessionDTO;
	}
}
