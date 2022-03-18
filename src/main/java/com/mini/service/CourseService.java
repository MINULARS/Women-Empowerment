package com.mini.service;

import java.util.List;

import com.mini.entity.TrainingCourse;

public interface CourseService {

	public void add(TrainingCourse tc);

	public TrainingCourse fetch(int id);

	public List<TrainingCourse> fetchEach();

}
