package com.mini.repository;

import java.util.List;

import com.mini.entity.TrainingCourse;

public interface CourseRepository {

	public void addCourse(TrainingCourse tc);

	public TrainingCourse fetchCourse(int id);

	public List<TrainingCourse> fetchAll();
}
