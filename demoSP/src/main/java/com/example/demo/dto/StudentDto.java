package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studentdetails")
public class StudentDto {
	@Id
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String email;
	private String coursename;
	
	@OneToOne
	private CourseDto courseDto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public CourseDto getCourseDto() {
		return courseDto;
	}

	public void setCourseDto(CourseDto courseDto) {
		this.courseDto = courseDto;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", name=" + name + ", email=" + email + ", coursename=" + coursename
				+ ", courseDto=" + courseDto + "]";
	}
	
	
	
	

}
