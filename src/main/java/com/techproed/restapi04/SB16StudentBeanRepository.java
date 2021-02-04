package com.techproed.restapi04;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SB16StudentBeanRepository extends JpaRepository<SB15StudentBean, Long>{

}
