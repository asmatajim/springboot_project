package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.CourseDto;
import com.example.demo.service.CourseService;

@Controller
public class CourseController {
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/chtml")
	public String courseHtml() {
		return "course";
	}
	
	@PostMapping("/ci")
	@ResponseBody
	public String insertCourse(@ModelAttribute CourseDto courseDto) {
		return courseService.insertCourse(courseDto);
	}
		 

}
