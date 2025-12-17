package com.example.demo.Service.ServiceImp;

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