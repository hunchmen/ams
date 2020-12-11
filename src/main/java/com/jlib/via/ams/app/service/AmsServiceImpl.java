package com.jlib.via.ams.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jlib.via.ams.app.domain.Student;
import com.jlib.via.ams.app.repository.AmsRepository;


/**
 * @author albertv
 * Date: Aug 21, 2020
 */
@Service
public class AmsServiceImpl implements AmsService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AmsServiceImpl.class);
	
	@Autowired
	private AmsRepository amsRepository;
	
	@Override
	public List<Student> getAllStudent() {
		LOGGER.info("AMS SERVICE: GET ALL STUDENT");
		return amsRepository.getAllStudent();
	}

	@Override
	public void addStudent(Student student) {
		LOGGER.info("AMS SERVICE: ADD NEW STUDENT");
		amsRepository.addStudent(student);	
	}

	@Override
	public Student findStudentById(Long id) {
		LOGGER.info("AMS SERVICE: FIND STUDENT BY ID");
		return amsRepository.findStudentById(id);
	}

	@Override
	public void deleteStudentById(Long id) {
		LOGGER.info("AMS SERVICE: DELETE STUDENT BY ID");
		amsRepository.deleteStudentById(id);
	}

	@Override
	public void updateStudent(Student student) {
		LOGGER.info("AMS SERVICE : UPDATE STUDENT");
		amsRepository.updateStudent(student);
	}

}
