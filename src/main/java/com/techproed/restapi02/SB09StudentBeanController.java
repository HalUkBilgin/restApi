package com.techproed.restapi02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB09StudentBeanController {
	
	private final SB08StudentBeanService studentService;
	
	@Autowired
	public SB09StudentBeanController(SB08StudentBeanService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path = "/api/v1/students")
	public List<SB07StudentBean> getAllStudents(){
		return studentService.getStudentList();
	}

}
