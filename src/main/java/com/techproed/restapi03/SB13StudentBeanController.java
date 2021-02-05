package com.techproed.restapi03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB13StudentBeanController {

	private final SB12StudentBeanService studentService;
	
	@Autowired
	public SB13StudentBeanController(SB12StudentBeanService studentService) {
		this.studentService = studentService;
	}
	@GetMapping(path = "/api/v1/allStudents")
	public List<SB10StudentBean> getAllStudent(){
		return studentService.getStudentList();
	}
}
