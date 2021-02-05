package com.techproed.restapi04;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SB19StudentBeanConfig {
	
	@Bean
	CommandLineRunner commandLineRunner2(SB16StudentBeanRepository studentRepository) {
		return args -> {
			SB15StudentBean aliCan = new SB15StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002, Month.JANUARY, 21));
			SB15StudentBean veliHan = new SB15StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2000, Month.FEBRUARY, 5));
			SB15StudentBean maryStar = new SB15StudentBean(103L, "Mary Star", "ms@gmail.com", LocalDate.of(2010, Month.MARCH, 5));
			
			studentRepository.saveAll(List.of(aliCan, veliHan, maryStar));
		               };
	}

}
