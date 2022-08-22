package com.wipro.fms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.fms.dto.FacultyDto;
import com.wipro.fms.entity.Faculty;
import com.wipro.fms.repository.FacultyRepository;

@Service
public class FacultyServiceImp implements IFacultyService {

	@Autowired
	FacultyRepository repo;
	
	@Override
	public Faculty addFaculty(FacultyDto dto) {

			Faculty faculty = new Faculty();
			
			faculty.setFacultyName(dto.getFacultyName());
			faculty.setCourse(dto.getCourse());
			faculty.setSalary(dto.getSalary());
		
		
		
		return repo.save(faculty);
	}

	@Override
	public List<Faculty> getAllFaculties() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
