package com.fullstack.fullstack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.fullstack.entities.Course;

public interface CourseDAO extends JpaRepository<Course, Long>{

}
