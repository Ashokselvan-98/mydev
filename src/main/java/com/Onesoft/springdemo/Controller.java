package com.Onesoft.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("wow")
	public String ak() {
		return "JUst LooKinG LiKe A woW !!!!";
	}

}
