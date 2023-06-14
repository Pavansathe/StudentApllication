package com.fbs.StudentDemo.StudentApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fbs.StudentDemo.StudentApplication.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
