package com.student.sbpm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.sbpm.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	Student findById(int id);
}
