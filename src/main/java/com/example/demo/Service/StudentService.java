package.com.example.Service;
import java.util.List;
import com.example.demo.Entity.StudentEntity;
public interface StudentService
{
    student createData(Student stu);
    List<Student>fetchRecord();
}