package com.techproed.restapi05;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SB22StudentBeanService {
	
	private static SB21StudentBeanRepository studentRepository;
	
	@Autowired
	public SB22StudentBeanService(SB21StudentBeanRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<SB20StudentBean> getStudents(){
		return studentRepository.findAll();
	}

	public static void addNewStudent(SB20StudentBean studentBean) {
		
		Optional<SB20StudentBean> studentEmailOptional = studentRepository.findSB20StudentBeanByEmail(studentBean.getEmail());
		Optional<SB20StudentBean> studentIdOptional = studentRepository.findSB20StudentBeanById(studentBean.getId());
		
		if(studentEmailOptional.isPresent()) {
			throw new IllegalStateException("Email is taken");
		}
		if(studentIdOptional.isPresent()) {
			throw new IllegalStateException("Id exists, id should be unique");
		}
		studentRepository.save(studentBean);
		
	}

}
