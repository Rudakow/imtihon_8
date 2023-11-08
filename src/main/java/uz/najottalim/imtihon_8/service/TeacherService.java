package uz.najottalim.imtihon_8.service;

import org.springframework.stereotype.Service;
import uz.najottalim.imtihon_8.entitis.Student;
import uz.najottalim.imtihon_8.entitis.Teacher;
import uz.najottalim.imtihon_8.repository.TeacherRepository;

@Service
public class TeacherService {
        private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher addTeacher(Teacher teacher){
            return teacherRepository.save(teacher);
        }
        public String  deleteTeacher(Long id){
            teacherRepository.deleteById(id);
            return "delete";
        }
        public Teacher GetTeacher(Long id){
            return teacherRepository.getById(id);
        }
    }
