package com.fbs.StudentDemo.StudentApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fbs.StudentDemo.StudentApplication.entity.Student;
import com.fbs.StudentDemo.StudentApplication.repository.StudentRepository;

@Service
public class ServiceProvider {

	@Autowired
	StudentRepository repo;
	
	public void saveStudent(Student s) {
		
		repo.save(s);
	}

	public List<Student> getStudent() {
		
		return (List<Student>) repo.findAll();	
	}

	
	public void delete(int id) {
	     repo.deleteById(id);;
		
	}

	public Student getStudentByRoll(int rollNumber) {
		
		 Optional<Student> student = repo.findById(rollNumber);
		 Student s = null;
			if(student.isPresent())
			{
				s = student.get();
				
			}else {
				throw new RuntimeException("Employee not found for id "+rollNumber);
				
				
			}
			
			return s;
			
		
	}

}
