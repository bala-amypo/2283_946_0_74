package com.example.demo.Service;
import java.util.List;
import com.example.demo.Entity.StudentEntity;
public interface StudentService
{
    StudentEntity createData(StudentEntity stu);
    List<StudentEntity>fetchRecord();
}