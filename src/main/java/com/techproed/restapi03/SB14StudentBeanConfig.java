package com.techproed.restapi03;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SB14StudentBeanConfig {

	@Bean
	CommandLineRunner commandLineRunner1(SB11StudentBeanRepository studentRepository) {
		
		return args -> {
			SB10StudentBean	aliCan = new SB10StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002, Month.JANUARY, 21), 19);
			SB10StudentBean	veliHan = new SB10StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2000, Month.FEBRUARY, 5), 21);
			SB10StudentBean	maryStar = new SB10StudentBean(103L, "Mary Star", "ms@gmail.com", LocalDate.of(2010, Month.MARCH, 5), 10);
							
							studentRepository.saveAll(List.of(aliCan, veliHan, maryStar));
						};
		
	}
}
