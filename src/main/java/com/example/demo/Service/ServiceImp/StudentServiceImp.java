package com.example.demo.Service.ServiceImp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Rep.StudentRep;
import com.example.demo.
@Service
public class StudentServiceImp implements StudentService
{
    @Autowired
    StudentRep aa;
    @override
    public StudentEntity createData(StudentEntity ss)
    {
        return aa.save(ss);
    }
    public List<StudentEntity>fetchRecord()
    {
        return aa.findAll();
    }  

}