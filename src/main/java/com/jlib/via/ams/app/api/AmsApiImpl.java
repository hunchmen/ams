package com.jlib.via.ams.app.api;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jlib.via.ams.app.domain.Student;
import com.jlib.via.ams.app.repository.AmsRepositoryImpl;
import com.jlib.via.ams.app.service.AmsService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class AmsApiImpl implements AmsApi{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(AmsApiImpl.class);
	
	@Autowired
	private AmsService amsService;

	@Override
	@RequestMapping(path = "/getAllStudent", method=RequestMethod.GET)
	@ApiOperation(value = "Get all student")
	@ApiResponses({@ApiResponse(code = 404, message = "API Get All Student not found")})
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<Student>> getAllStudent() {
		LOGGER.info("AMS-API : GET ALL STUDENT");
		List<Student> students = new ArrayList<>();
		
		//add service call for logic
		students = amsService.getAllStudent();
		
		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	@Override
	@RequestMapping(path = "/addNewStudent", method=RequestMethod.POST)
	@ApiOperation(value = "Add new student")
	@ApiResponses({@ApiResponse(code = 404, message = "API add new student not found")})
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		LOGGER.info("AMS-API : ADD NEW STUDENT");
		amsService.addStudent(student);
		
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@Override
	@RequestMapping(path = "/findStudentById/{id}", method=RequestMethod.POST)
	@ApiOperation(value = "Find Student by id")
	@ApiResponses({@ApiResponse(code = 404, message = "API add new student not found")})
	public ResponseEntity<Student> findStudentById(@PathVariable Long id) {
		LOGGER.info("AMS-API : FIND STUDENT BY ID");
		
		Student student = amsService.findStudentById(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@Override
	@RequestMapping(path = "/deleteStudentById/{id}", method=RequestMethod.DELETE)
	@ApiOperation(value = "Delete student by id")
	@ApiResponses({@ApiResponse(code = 404, message = "API Delete Student by Id not found")})
	public void deleteStudentById(Long id) {
		LOGGER.info("AMS-API : DELETE STUDENT BY ID");
		amsService.deleteStudentById(id);;
	}

}
