package com.wipro.fms.service;

import java.util.List;

import com.wipro.fms.dto.FacultyDto;
import com.wipro.fms.entity.Faculty;

public interface IFacultyService {
	
	
	public Faculty  addFaculty(FacultyDto dto);
	
	public List<Faculty> getAllFaculties();

}
