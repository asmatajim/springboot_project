package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="coursedetails")
public class CourseDto {
	@Id
	private String coursename;
	@Column(nullable = false)
	private int coursefees;
	@Column(nullable = false)
	private String courseduration;
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(int coursefees) {
		this.coursefees = coursefees;
	}
	public String getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}
	@Override
	public String toString() {
		return "CourseDto [coursename=" + coursename + ", coursefees=" + coursefees + ", courseduration="
				+ courseduration + "]";
	}
	
	
	
}
