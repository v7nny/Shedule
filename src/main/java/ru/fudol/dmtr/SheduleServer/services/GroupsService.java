package ru.fudol.dmtr.SheduleServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fudol.dmtr.SheduleServer.models.Group;
import ru.fudol.dmtr.SheduleServer.repositories.GroupsRepository;
import java.util.List;

/**
 * Сервис для групп с CRUD методами
 * @autor Dmitry Fugol
 */

@Service
@Transactional(readOnly = true)
public class GroupsService {
    private final GroupsRepository groupsRepository;


    @Autowired
    public GroupsService(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }



    public List<Group> findAll() {
        return groupsRepository.findAll();
    }

    public List<Group> findBySpecializationNameAndCourse(String specializationName, int course) {
        return groupsRepository.findBySpecializationGroupNameAndCourse(specializationName, course);
    }

    public Group findOne(int id) {
        return groupsRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Group group) {
        groupsRepository.save(group);
    }

    @Transactional
    public void update(int id, Group updatedGroup) {
        updatedGroup.setId(id);
        groupsRepository.save(updatedGroup);
    }

    @Transactional
    public void delete(int id) {
        groupsRepository.deleteById(id);
    }
}
