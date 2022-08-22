package com.wipro.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.fms.dto.FacultyDto;
import com.wipro.fms.entity.Faculty;
import com.wipro.fms.service.IFacultyService;

@RestController
@RequestMapping("api/v1/faculties")
public class FacultyRestController {

	@Autowired
	IFacultyService service;
	
	
	@PostMapping("/add")
	public Faculty   addFaculty(@RequestBody FacultyDto dto) {
		
		
		
			return service.addFaculty(dto);
		
		
	}
	
	
	@GetMapping("/get-all")
	public List<Faculty> getAll(){
		
		
		return service.getAllFaculties();		
	}
	
	
	
	
	
	
	
	
	
	
}
