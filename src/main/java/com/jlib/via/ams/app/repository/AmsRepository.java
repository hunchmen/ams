package com.jlib.via.ams.app.repository;

import java.util.List;

import com.jlib.via.ams.app.domain.Student;

public interface AmsRepository{
	public List<Student> getAllStudent();
	
	public void addStudent(Student student);
	
	public Student findStudentById(Long id);
	
	public void deleteStudentById(Long id);
	
	public void updateStudent(Student student);
}
