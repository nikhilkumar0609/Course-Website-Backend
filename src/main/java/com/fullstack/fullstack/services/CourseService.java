package com.fullstack.fullstack.services;

import java.util.List;
import java.util.Optional;

import com.fullstack.fullstack.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Optional<Course> getCourse(Long courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(Long courseId);
	
}
