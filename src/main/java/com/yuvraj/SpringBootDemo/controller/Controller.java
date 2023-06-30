package com.yuvraj.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yuvraj.SpringBootDemo.dto.Fruit;

@RestController
public class Controller {
	
	@GetMapping("/demo")
	public void demo() {
		System.out.println("Navin api banavla ahe");
	}
	@GetMapping("/apiDemo")
	public String apiDemo() {
		return "Api demo";
	}
	@PostMapping("/fruit")
	private void getFruit(@RequestBody Fruit fruit) {
		System.out.println(fruit);
	}
}
