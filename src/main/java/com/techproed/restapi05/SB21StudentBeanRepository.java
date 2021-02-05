package com.techproed.restapi05;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SB21StudentBeanRepository extends JpaRepository<SB20StudentBean, Long>{
	
	//SELECT * FROM students WHERE email = ?
	Optional<SB20StudentBean> findSB20StudentBeanByEmail(String email);
	
	Optional<SB20StudentBean> findSB20StudentBeanById(Long id);
}
