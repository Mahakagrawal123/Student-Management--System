package com.springboot.sms.service;

import java.util.List;

import com.springboot.sms.entities.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	 Student getStudentId(Long id) ;
	 
	 void deleteStudentId(Long id);
		
	

}
