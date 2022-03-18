package com.mini.service;

import java.util.List;

import com.mini.entity.NGO;
import com.mini.entity.ResponseDTO;
import com.mini.entity.User;

public interface UserService {

	public void add(User user);

	public User fetch(int id);

	public User verifyUser(User login);

	public ResponseDTO confirmLogin(User login);

	public List<User> fetchEach();

}

