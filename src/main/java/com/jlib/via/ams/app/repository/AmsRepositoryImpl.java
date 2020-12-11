package com.jlib.via.ams.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jlib.via.ams.app.domain.Student;

/**
 * @author albertv
 * Date: Aug 21, 2020
 */
@Repository
public class AmsRepositoryImpl implements AmsRepository{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AmsRepositoryImpl.class);
	
	@Autowired
	@PersistenceContext 
	private EntityManager entityManager;

	@Override
	public List<Student> getAllStudent() {
		LOGGER.info("AMS REPOSITORY : GET ALL STUDENT");
		String query = "SELECT s FROM Student s";
		
		TypedQuery<Student> queryString = entityManager.createQuery(query, Student.class);
		List<Student> results = queryString.getResultList();	
		LOGGER.info("AMS REPOSITORY : RESULT {}", results);
		
		return  results;
	}

	@Override
	@Transactional
	public void addStudent(Student student) {
		LOGGER.info("AMS REPOSITORY : ADD NEW STUDENT");
		entityManager.persist(student);
	}

	@Override
	public Student findStudentById(Long id) {
		LOGGER.info("AMS REPOSITORY : FIND STUDENT BY ID");
		return entityManager.find(Student.class, id);
	}
	
}
