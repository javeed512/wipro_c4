package com.wipro.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.sms.dto.StudentDTO;
import com.wipro.sms.entities.Student;
import com.wipro.sms.service.IStudentService;
import com.wipro.sms.service.StudentServiceImp;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/students")
public class StudentRestController {

	@Autowired
	private IStudentService service;

	@PostMapping("/add")
	public Student addStudent(@RequestBody StudentDTO dto) {

		Student student = null;

		boolean isValid = StudentServiceImp.validateStudent(dto);

		if (isValid) {

			student = service.addStudent(dto);

		}

		return student;

	}

	
	@GetMapping("/getall")
	public List<Student> getAllStudents(){
		
		
		return service.getAllStudents();
		
	}
	
	
}
