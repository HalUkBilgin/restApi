package com.techproed.restapi06;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class SB27StudentBeanService {
	
	private static SB26StudentBeanRepository studentRepository; 
	
	@Autowired
	public SB27StudentBeanService(SB26StudentBeanRepository studentRepository) {
		this.studentRepository = studentRepository; 
	}
	
	public List<SB25StudentBean> getStudents(){
		return studentRepository.findAll();
	}	
	
	public static SB25StudentBean addNewStudent(SB25StudentBean studentBean) {
		
		Optional<SB25StudentBean> studentEmailOptional = studentRepository.findSB25StudentBeanByEmail(studentBean.getEmail());
		Optional<SB25StudentBean> studentIdOptional = studentRepository.findSB25StudentBeanById(studentBean.getId());
		
		if(studentEmailOptional.isPresent()) {
			throw new IllegalStateException("Email is taken");
		}
		if(studentIdOptional.isPresent()) {
			throw new IllegalStateException("Id exists, id should be unique");
		}
		return studentRepository.save(studentBean);	
	}
	
	public String deleteStudentById(Long studentId) {
		boolean isIdExist = studentRepository.existsById(studentId);
		
		if(!isIdExist) {
			throw new IllegalStateException(studentId + " does not exist in the table");
		}
		
		studentRepository.deleteById(studentId);
		
		return studentId + " is deleted successfully...";
		
	}
	
	public SB25StudentBean updateStudentById(Long studentId, @RequestBody SB25StudentBean studentDetails) {
		
		//Check if the data exists in database or not
		SB25StudentBean student = studentRepository.findById(studentId).orElseThrow(()->new IllegalStateException(studentId + " does not exist"));
		
		//Check if the student name will be updated with a new name or not
		String studentName = student.getName();
		if(!studentName.equals(studentDetails.getName())) {
			student.setName(studentDetails.getName());
		}
		
		//Check if the student email will be updated with a new email or not
		String studentEmail = student.getEmail();
		if(!studentEmail.equals(studentDetails.getEmail())) {
			student.setEmail(studentDetails.getEmail());
		}
		
		return studentRepository.save(student);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
