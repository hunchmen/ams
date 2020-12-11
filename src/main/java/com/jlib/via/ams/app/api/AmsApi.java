package com.jlib.via.ams.app.api;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jlib.via.ams.app.domain.Student;

public interface AmsApi {
	
	public ResponseEntity<List<Student>> getAllStudent();
	
	public ResponseEntity<Student> addStudent(Student student);

	public ResponseEntity<Student> findStudentById(Long id);
	
	public void deleteStudentById(Long id);
	
}
