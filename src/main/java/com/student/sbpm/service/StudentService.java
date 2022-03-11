package com.student.sbpm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.sbpm.entity.Student;
import com.student.sbpm.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public List<Student> getAllStudents() {
		return (List<Student>)studentRepository.findAll() ;
	}

	public Student getStudentById(int id) {
		return studentRepository.findById(id);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}

	public void deleteAllStudent() {
		studentRepository.deleteAll();
	}
}
