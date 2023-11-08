package uz.najottalim.imtihon_8.controller;

import org.springframework.web.bind.annotation.*;
import uz.najottalim.imtihon_8.entitis.Student;
import uz.najottalim.imtihon_8.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
@PostMapping("add")
    public Student add(@RequestBody Student student){
        return service.addStudent(student);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        return service.deleteStudent(id);
    }
    @GetMapping("getById/{id}")
    public Student get(@PathVariable Long id){
        return service.get(id);
    }


}
