package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.Teacher;
import ru.fudol.dmtr.SheduleServer.services.TeachersService;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeachersController {

    private final TeachersService teachersService;

    @Autowired
    public TeachersController(TeachersService teachersService) {
        this.teachersService = teachersService;
    }

    @GetMapping
    public List<Teacher> getAll() {
        return teachersService.findAll();
    }

    @GetMapping("/{id}")
    public Teacher getOne(@PathVariable("id") int id) {
        return teachersService.findOne(id);
    }

}
