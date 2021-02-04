package com.techproed.restapi01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB03HelloWorldBeanController {

	//1.Way
	@RequestMapping(method=RequestMethod.GET, path = "/helloWorldBean1")
	public SB02HelloWorldBean helloWorldBean1() {
		return new SB02HelloWorldBean("Hello world", 1);
	}
	
	//2.Way
	@GetMapping(path = "/helloWorldBean2")
	public SB02HelloWorldBean helloWorldBean2() {
		return new SB02HelloWorldBean("Hello world", 2);
	}
	
}
