package com.student.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	Logger logger = LoggerFactory.getLogger(StudentServiceImpl.class);
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> viewAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student addNewStudent(Student student) {
      return studentRepository.save(student);
	}

	@Override
	public Student updateStudentDetail(Student student) {
		if(studentRepository.existsById(student.getStudentId())) {
		    return studentRepository.save(student);
		}
		else {
			logger.error("Trying to update the id, not possible!!!!!!!!!!!!!");
			return student;
		}
	}

	@Override
	public String deleteStudentDetails(int id) {
		if(studentRepository.existsById(id)) {
		    studentRepository.deleteById(id);
		    logger.info("Details deleted.....");
		    return "deleted sucessfully";
		}
		else {
			logger.warn("Wrong id !!!!!");
			return "id does not exist";
		}
	}

	

}
