package com.wipro.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.user.dto.UserDTO;
import com.wipro.user.entity.User;
import com.wipro.user.repository.UserRepository;
import com.wipro.user.vo.Department;
import com.wipro.user.vo.UserDeptVO;

@Service
public class UserServiceImp implements IUserService {

	@Autowired
	UserRepository repo;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public User addUser(UserDTO userDTO) {

		User user = new User();

		user.setUserId(userDTO.getUserId());
		user.setUserName(userDTO.getUserName());
		user.setEmail(userDTO.getEmail());
		user.setDepartmentId(userDTO.getDepartmentId());

		return repo.save(user);
	}

	@Override
	public User getUserById(long uid) {
		// TODO Auto-generated method stub
		return repo.findById(uid).orElse(new User());
	}

	@Override
	public UserDeptVO getUserByIdWithDepartment(long uid) {

		User user = getUserById(uid);

		long deptId = user.getDepartmentId();
		
		
ResponseEntity<Department> response =	restTemplate.getForEntity("http://localhost:8181/api/v1/department/get/"+deptId, Department.class);
		
		
		Department dept =	response.getBody();
		
		UserDeptVO  userDept = new UserDeptVO(user, dept);


		return userDept;
	}

}
