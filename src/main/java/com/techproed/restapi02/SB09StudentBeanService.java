package com.techproed.restapi02;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.stereotype.Service;

//@Component annotation works as well but @Service annotation is more common
@Service
public class SB09StudentBeanService {
	
	public List<SB07StudentBean> getStudentList(){
		return List.of(
						new SB07StudentBean(101L, "Ali Can", "ac@gmail.com", LocalDate.of(2002, Month.JANUARY, 12), 19),
						new SB07StudentBean(102L, "Veli Han", "vh@gmail.com", LocalDate.of(2000, Month.FEBRUARY, 1), 21),
						new SB07StudentBean(103L, "Mary Star", "ms@gmail.com", LocalDate.of(2010, Month.JANUARY, 28), 11)
					  );
	}

}
