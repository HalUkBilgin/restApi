package com.techproed.restapi01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB04HelloWorldWithParameterController {
	
	@GetMapping(path = "/helloWorldBean3/{name}")
	public SB02HelloWorldBean helloWorldBeanParameterized(@PathVariable String name) {
		return new SB02HelloWorldBean(String.format("Hello parameterized %s", name), 3);	
	}

}
