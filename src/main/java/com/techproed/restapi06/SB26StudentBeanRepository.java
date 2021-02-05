package com.techproed.restapi06;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SB26StudentBeanRepository extends JpaRepository<SB25StudentBean, Long>{
	
	//SELECT * FROM students WHERE email = ?
	Optional<SB25StudentBean> findSB25StudentBeanByEmail(String email);
	
	Optional<SB25StudentBean> findSB25StudentBeanById(Long id);
}
