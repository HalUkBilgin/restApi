package com.techproed.restapi04;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SB17StudentBeanService {
	
	private final SB16StudentBeanRepository studentRepository;
	
	@Autowired
	public SB17StudentBeanService(SB16StudentBeanRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public List<SB15StudentBean> getStudentList(){
		return studentRepository.findAll();
	}

}
