package com.service;

import java.util.List;

import com.pojo.User;

public interface IuserService {
	User getById(int id);
	User getByPhoneAndPassword(String phone, String password);
	User getByPhone(String phone);
	User getByUsername(String username);
	List<User> listAll();
	int delete(int id);
	int update(User user);
	int insert(User user);
	
}
