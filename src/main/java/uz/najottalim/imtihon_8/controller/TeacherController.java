package uz.najottalim.imtihon_8.controller;

import org.springframework.web.bind.annotation.*;
import uz.najottalim.imtihon_8.entitis.Teacher;
import uz.najottalim.imtihon_8.service.TeacherService;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    private final TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }


    @PostMapping("add")
    public Teacher add(@RequestBody Teacher teacher){
        return service.addTeacher(teacher);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        return service.deleteTeacher(id);
    }
    @GetMapping("getById/{id}")
    public Teacher get(@PathVariable Long id){
        return service.GetTeacher(id);
    }


}

