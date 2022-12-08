package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
public class HelloWorldController {

//	@GetMapping("/")
//	public String sayHi() {
//		return "Hello world";
//	}

	@GetMapping("/")
	public String dateFormat(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return formatter.format(date);
	}
}



