@Service
public class StudentServiceImp implements StudentService
{
    @Autowired
    StudentRep aa;
    @override
    public Student createData(Student ss)
    {
        return aa.save(ss);
    }
    public Student 

}