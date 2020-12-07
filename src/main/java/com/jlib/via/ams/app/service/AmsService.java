package com.jlib.via.ams.app.service;

import java.util.List;

import com.jlib.via.ams.app.domain.Student;

public interface AmsService {
	
	public List<Student> getAllStudent();
	
	public void addStudent(Student student);
	
	public Student findStudentById(Long id);
}
