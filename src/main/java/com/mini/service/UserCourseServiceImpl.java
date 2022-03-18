package com.mini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mini.entity.UserContactDetails;
import com.mini.entity.UserCourse;
import com.mini.repository.UserContactRepository;
import com.mini.repository.UserCourseRepository;

@Service
public class UserCourseServiceImpl implements UserCourseService {

	@Autowired
	private UserCourseRepository userCourseRepository;

	@Transactional
	public void addCourse(UserCourse ucd) {
		userCourseRepository.add(ucd);
	}

	public List<UserCourse> fetchEach() {
		return userCourseRepository.fetchAll();

	}

}

