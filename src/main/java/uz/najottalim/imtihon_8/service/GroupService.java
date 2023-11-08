package uz.najottalim.imtihon_8.service;

import org.springframework.stereotype.Service;
import uz.najottalim.imtihon_8.entitis.Group;
import uz.najottalim.imtihon_8.entitis.Student;
import uz.najottalim.imtihon_8.repository.GroupRepository;

@Service
public class GroupService {

        private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public Group addGroup(Group group){
            return groupRepository.save(group);
        }
        public String  deleteGroup(Long id){
            groupRepository.deleteById(id);
            return "delete";
        }
        public Group GetGroup(Long id){
            return groupRepository.getById(id);
        }
    }


