package com.mini.service;

import java.util.List;

import com.mini.entity.TrainingCourse;
import com.mini.entity.UserFamilyDetails;

public interface UserFamilyService {

	public void add(UserFamilyDetails ufd);

	public List<UserFamilyDetails> fetchEach();

}

