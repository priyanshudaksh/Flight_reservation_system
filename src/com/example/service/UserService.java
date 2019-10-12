package com.example.service;

import com.example.pojo.User;

public interface UserService {
	public int store(User user);
	public User login(String email, String password);
}
