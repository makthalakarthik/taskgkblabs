package com.taskgkb.taskgkb.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskgkb.taskgkb.dto.UserDto;

@Repository
public interface userrepository extends JpaRepository<UserDto,Integer>{
	
	

}
