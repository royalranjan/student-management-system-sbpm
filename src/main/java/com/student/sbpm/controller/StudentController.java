package com.student.sbpm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.sbpm.entity.Student;
import com.student.sbpm.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		Student s= studentService.saveStudent(student);
		return s;
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		List<Student> sList =studentService.getAllStudents();
		return sList;
	}
	
	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable int id) {
		Student sid= studentService.getStudentById(id);
		return sid;
	}
	
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		Student supd= studentService.updateStudent(student);
		return supd;
	}
	
	@DeleteMapping("/deleteStudentById/{id}")
	public void deleteStudentById(@PathVariable int id) {
		studentService.deleteStudentById(id);
	}
	
	@DeleteMapping("/deleteAllStudent")
	public void deleteAllStudent() {
		studentService.deleteAllStudent();
	}
}
