package com.mini.repository;

import java.util.List;

import com.mini.entity.NGO;
import com.mini.entity.User;

public interface UserRepository {

	public void addUser(User user);

	public User fetchUser(int id);

	public List<User> fetchAll();

	public User fetchUser(User login);

}
