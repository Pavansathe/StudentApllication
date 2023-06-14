package com.fbs.StudentDemo.StudentApplication.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.fbs.StudentDemo.StudentApplication.entity.Student;
import com.fbs.StudentDemo.StudentApplication.service.ServiceProvider;

@Controller
public class DataController {

	@Autowired
	ServiceProvider service;
	
	
	@PostMapping("/student")
	public String saveStudentDetails(Student s)
	{
		service.saveStudent(s);
		return "output.html";
	}
	
	@GetMapping("/student/all")
	public String getAllStudentDetails(Model model) {
		
		model.addAttribute("allstudent", service.getStudent());
		return "result.html";
	}
	
	@GetMapping("/update/{rollNumber}")
	public String updateDetails(@PathVariable int rollNumber, Model model) {
		  
		  Student s = service.getStudentByRoll(rollNumber);
		 
		model.addAttribute("student", s);
		return "update.html";
		
	}
	
	
	
	@GetMapping("/student/delete/{rollNumber}")
	public String  deleteall(@PathVariable int rollNumber) {
		service.delete(rollNumber);
		return "delete.html";
	}
	
	
}
