package com.wipro.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {  // pojo class

	private long userId;
	private String userName;
	private String email;
	private long  departmentId;
	
	
}
