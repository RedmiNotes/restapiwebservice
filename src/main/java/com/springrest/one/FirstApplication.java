package com.springrest.one;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApplication {

	@RequestMapping("/first")
	public String first_app() {
		return "<div align='center'><h2><font color='blue'>Welcome To My Page...!!!</div></font></h2>";
	}
}
