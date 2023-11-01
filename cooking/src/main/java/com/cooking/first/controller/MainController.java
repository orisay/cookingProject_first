package com.cooking.first.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {

	public String viewMain() {
		return "index";
	}
}
