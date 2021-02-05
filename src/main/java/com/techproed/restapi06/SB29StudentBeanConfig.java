package com.techproed.restapi06;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SB29StudentBeanConfig {

	@Bean
	CommandLineRunner commandLineRunner3(SB26StudentBeanRepository studentRepository) {
		
		return args -> {
			SB25StudentBean aliCan = new SB25StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002, Month.JANUARY, 21));
			SB25StudentBean veliHan = new SB25StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2000, Month.MAY, 2));
			SB25StudentBean maryStar = new SB25StudentBean(103L, "Mary Star", "ms@gmail.com", LocalDate.of(2001, Month.FEBRUARY, 12));
			
			studentRepository.saveAll(List.of(aliCan, veliHan, maryStar));
		               };
		
	}
}
