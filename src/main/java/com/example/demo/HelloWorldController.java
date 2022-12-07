package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


import java.util.Date;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String sayHi() {
		return "Hello world";
	}

	@GetMapping("/date")
	public Date date(@RequestParam("date")
					 @DateTimeFormat(pattern = "dd.MM.yyyy") Date date) { return date;}
	}



