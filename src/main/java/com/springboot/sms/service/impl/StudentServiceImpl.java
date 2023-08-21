package com.springboot.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sms.entities.Student;
import com.springboot.sms.repository.StudentRespository;
import com.springboot.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRespository studentRespository;
	

	public StudentServiceImpl(StudentRespository studentRespository) {
		super();
		this.studentRespository = studentRespository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRespository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRespository.save(student);
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRespository.save(student);
	}


	@Override
	public Student getStudentId(Long id) {
	
		return studentRespository.findById(id).get();
	}


	@Override
	public void deleteStudentId(Long id) {
		studentRespository.deleteById(id);
		
	}


	
	

}
