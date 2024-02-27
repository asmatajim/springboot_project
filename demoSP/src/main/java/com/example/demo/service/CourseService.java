package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;
import com.example.demo.dto.CourseDto;

@Service
public class CourseService {
	@Autowired
	CourseDao courseDao;
	
	public String insertCourse(CourseDto courseDto) {
		 return courseDao.insertCourse(courseDto);
	}
	
	public CourseDto fetchCourse(String coursename) {
		return courseDao.fetchCourse(coursename);
	}
}
