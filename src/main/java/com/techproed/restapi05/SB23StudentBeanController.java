package com.techproed.restapi05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB23StudentBeanController {
	
	private final SB22StudentBeanService studentService;
	
	@Autowired
	public SB23StudentBeanController(SB22StudentBeanService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path = "/api/v1/students")
	public List<SB20StudentBean> studentList(){
		return studentService.getStudents();
	}
	
	@PostMapping(path = "/api/v1/students")
	public void insertNewStudent(@RequestBody SB20StudentBean student) {
		SB22StudentBeanService.addNewStudent(student);
	}

}
