 package com.springboot.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.sms.entities.Student;
import com.springboot.sms.repository.StudentRespository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRespository studentRespository;
	@Override
	public void run(String... args) throws Exception {
		
		/*
		 * Student student1= new Student("Mahak", "Agrawal", "Mahak@gmail.com");
		 * studentRespository.save(student1);
		 * 
		 * Student student2= new Student("Meena", "Shah", "Meena@gmail.com");
		 * studentRespository.save(student2);
		 * 
		 * Student student3= new Student("Om", "Rathi", "Om@gmail.com");
		 * studentRespository.save(student3);
		 */
	}


	
	
}
