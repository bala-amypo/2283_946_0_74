package com.example.demo.Rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exmaple.demo.entity.StudentEntity;

public interface StudentRep extends JpaRepository<StudentEntity,Integer>{

}