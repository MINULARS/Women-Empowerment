package com.mini.service;

import java.util.List;

import com.mini.entity.UserCourse;

public interface UserCourseService {

	public void addCourse(UserCourse uc);

	public List<UserCourse> fetchEach();

}
