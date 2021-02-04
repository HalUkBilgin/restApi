package com.techproed.restapi01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB01HelloWorldController {
	
	//Create a GET Request
	
	//1.Way:
	@RequestMapping(method = RequestMethod.GET, path = "/helloWorld1")
	public String helloWorld1() {
		return "Hello world in first way";
	}
	
	//2.Way:
	@GetMapping(path = "/helloWorld2")
	public String helloWorld2() {
		return "Hello world in second way";
	}
	
	

}
