package com.wipro.user.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Department { // dept pojo class to get data from dept-microservice and use in  user-microservice
	
	private  long departmentId;
	private  String departmentName;
	private  String  departmentAddress;
	private  String departmentCode;

}
