package uz.najottalim.imtihon_8.service;

import org.springframework.stereotype.Service;
import uz.najottalim.imtihon_8.entitis.Student;
import uz.najottalim.imtihon_8.repository.StudentRepository;

import java.util.Set;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student addStudent(Student student){
        return studentRepository.save(student);
    }
    public String  deleteStudent(Long id){
         studentRepository.deleteById(id);
         return "delete";
    }
    public Student get(Long id){
        return studentRepository.getById(id);
    }
    }
}
