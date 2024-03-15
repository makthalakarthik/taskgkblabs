package com.taskgkb.taskgkb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskgkb.taskgkb.dto.UserDto;
import com.taskgkb.taskgkb.repository.userrepository;

@Service
public class UserService {

	@Autowired
	private userrepository repository;

	public UserDto saveUser(UserDto userdto) {
		return repository.save(userdto);
	}

	public List<UserDto> getdetails() {
		return repository.findAll();
	}

}
