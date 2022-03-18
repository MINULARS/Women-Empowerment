package com.mini.repository;


import java.util.List;
import com.mini.entity.UserCourse;
public interface UserCourseRepository { 
	public void add(UserCourse uc); 
	public List<UserCourse> fetchAll();
	}

