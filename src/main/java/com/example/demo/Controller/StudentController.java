package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation .*;
import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service. StudentService;

@RestController
public class StudentController {

@Autowired
StudentService ser;

@PostMapping("d")
public Student createData(@RequestBody Student stu){
return ser.createData(stu);
}
@GetMapping("/fetchrecord")
public List<Student> fetchRecord(){
return ser.fetchRecord();
}
}