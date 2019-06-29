package com.github.ponymaggie.jpa.repository;


import com.github.ponymaggie.jpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByName(String name);
    Long countByName(String name);
}
