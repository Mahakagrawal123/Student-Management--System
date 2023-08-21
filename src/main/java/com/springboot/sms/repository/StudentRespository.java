package com.springboot.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sms.entities.Student;

public interface StudentRespository extends JpaRepository<Student, Long>{
	

}
