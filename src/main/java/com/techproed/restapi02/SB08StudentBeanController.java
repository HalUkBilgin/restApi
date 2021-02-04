package com.techproed.restapi02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB08StudentBeanController {
	
	private final SB09StudentBeanService studentService;
	
	@Autowired
	public SB08StudentBeanController(SB09StudentBeanService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path = "/api/v1/students")
	public List<SB07StudentBean> getAllStudents(){
		return studentService.getStudentList();
	}

}
