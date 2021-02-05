package com.techproed.restapi05;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SB24StudentBeanConfig {
	
	@Bean
	CommandLineRunner commandLineRunner3(SB21StudentBeanRepository studentRepository) {
		
		return args -> {
			SB20StudentBean aliCan = new SB20StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002, Month.JANUARY, 21));
			SB20StudentBean veliHan = new SB20StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2000, Month.MAY, 2));
			SB20StudentBean maryStar = new SB20StudentBean(103L, "Mary Star", "ms@gmail.com", LocalDate.of(2001, Month.FEBRUARY, 12));
			
			studentRepository.saveAll(List.of(aliCan, veliHan, maryStar));
		               };
		
	}

}
