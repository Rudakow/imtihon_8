package uz.najottalim.imtihon_8.controller;


import org.springframework.web.bind.annotation.*;
import uz.najottalim.imtihon_8.entitis.Group;
import uz.najottalim.imtihon_8.entitis.Student;
import uz.najottalim.imtihon_8.service.GroupService;

@RestController
@RequestMapping("group")
public class GroupController {

    private final GroupService service;

    public GroupController(GroupService service) {
        this.service = service;
    }


    @PostMapping("add")
    public Group add(@RequestBody Group group){
        return service.addGroup(group);
    }
    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        return service.deleteGroup(id);
    }
    @GetMapping("getById/{id}")
    public Group get(@PathVariable Long id){
        return service.GetGroup(id);
    }


}

