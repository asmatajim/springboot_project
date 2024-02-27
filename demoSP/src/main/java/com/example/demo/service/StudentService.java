package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.dto.StudentDto;

@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
	public String insertstudent(StudentDto studentDto) {
		return studentDao.insertstudent(studentDto);
	}
	
	public StudentDto fetchStudentById(int id)
	{
		Optional<StudentDto> od=studentDao.fetchStudentById(id);
		if(od.isPresent())
		{
			return od.get();
		}
		else
			return null;
		
	}
	
	public List<StudentDto> fetchAllStudent()
	{
		List<StudentDto> list=studentDao.fetchAllStudent();
		if(list.isEmpty())
		{
			return null;
		}
		else
			return list;
		
	}


}
