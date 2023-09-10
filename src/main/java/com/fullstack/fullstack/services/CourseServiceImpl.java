package com.fullstack.fullstack.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.fullstack.dao.CourseDAO;
import com.fullstack.fullstack.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseDAO courseDAO;

	public CourseServiceImpl() {
	}
	
	@Override
	public List<Course> getCourses() {
		return courseDAO.findAll();
	}

	@Override
	public Optional<Course> getCourse(Long courseId) {
		return courseDAO.findById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDAO.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		courseDAO.save(course);
		return course;
	}

	@Override
	public void deleteCourse(Long courseId) {
		Optional<Course> optionalCourse = courseDAO.findById(courseId);
		if(optionalCourse.isPresent()) {
			Course c = optionalCourse.get();
			courseDAO.delete(c);
		}
	}

}
