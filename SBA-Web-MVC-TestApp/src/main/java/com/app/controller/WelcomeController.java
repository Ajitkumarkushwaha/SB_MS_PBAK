package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/welcome")
public class WelcomeController {

	@RequestMapping(value = "/show")
	public String show() {
		return "Welcome";
	}
}
