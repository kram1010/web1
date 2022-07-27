package com.sampleweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class webController {
	@GetMapping("/")
	public String getMessage() {
		return "ramkumar";
	}

}
