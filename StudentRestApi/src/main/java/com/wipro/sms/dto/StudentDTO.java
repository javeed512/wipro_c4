package com.wipro.sms.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
	
	
	private long id;
	private String uname;
	private String password;
	private  String email;
	private  String gender;
	private  LocalDate dob;
	private  String course;
	private  long phone;
	
	

}
