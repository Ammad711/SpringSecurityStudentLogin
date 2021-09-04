package com.ammad.SpringSecurityStudentLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ammad.SpringSecurityStudentLogin.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
