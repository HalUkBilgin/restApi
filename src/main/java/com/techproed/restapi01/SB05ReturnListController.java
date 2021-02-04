package com.techproed.restapi01;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB05ReturnListController {
	
	@GetMapping(path = "/stringList")
	public List<String> stringList(){
		return List.of("Ali", "Can", "Mark", "Star", "Ocean");
	}
	
	@GetMapping(path = "/beanList")
	public List<SB06StudentBean> beanList(){
		return List.of(
					   new SB06StudentBean("Ali Can", 101, "Male"),
					   new SB06StudentBean("Veli Han", 102, "Male"),
					   new SB06StudentBean("Mary Star", 103, "Female")
					  );
	}

}
