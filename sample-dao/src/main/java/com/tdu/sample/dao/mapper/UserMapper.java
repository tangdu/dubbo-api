package com.tdu.sample.dao.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tdu.sample.model.User;

@Repository
public interface UserMapper {

	public List<User> findAll();
	
	public void delete(String id);
	
	public void add(User user);
}
