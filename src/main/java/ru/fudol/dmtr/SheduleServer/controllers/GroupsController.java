package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.Group;
import ru.fudol.dmtr.SheduleServer.services.GroupsService;

import java.util.List;

/**
 * Контроллер возвращает список групп/один группу
 * @autor Dmitry Fugol
 */

@RestController
@RequestMapping("/groups")
public class GroupsController {

    private final GroupsService groupsService;


    @Autowired
    public GroupsController(GroupsService groupsService) {
        this.groupsService = groupsService;
    }

    @GetMapping
    public List<Group> getAll() {
        return groupsService.findAll();
    }

    @GetMapping("/{id:\\d+}")
    public Group getOne(@PathVariable("id") int id) {
        return groupsService.findOne(id);
    }

    @GetMapping("/{name}-{course}")
    public List<Group> getBySpecializationAndCourse(@PathVariable("name") String name,
                                                    @PathVariable("course") String course) {
        int courseInt;
        if(course == null || course.isEmpty()) courseInt = 0;
        else courseInt = Integer.parseInt(course);
        return groupsService.findBySpecializationNameAndCourse(name, courseInt);
    }

    @GetMapping("/{name}&&{course}")
    public Group getGroupByNameAndCourse(@PathVariable("name") String name,
                                             @PathVariable("course") int course){
        return groupsService.findByNameAndCourse(name, course);
    }

}
