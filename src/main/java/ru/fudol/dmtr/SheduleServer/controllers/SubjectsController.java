package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.Subject;
import ru.fudol.dmtr.SheduleServer.services.SubjectsService;

import java.util.List;
/**
 * Контроллер возвращает список предметов/один предмет
 * @autor Dmitry Fugol
 */

@RestController
@RequestMapping("/subjects")
public class SubjectsController {

    private final SubjectsService subjectsService;


    @Autowired
    public SubjectsController(SubjectsService subjectsService) {
        this.subjectsService = subjectsService;
    }

    @GetMapping
    public List<Subject> getAll() {
        return subjectsService.findAll();
    }


    @GetMapping("/{id}")
    public Subject getOne(@PathVariable("id") int id) {
        return subjectsService.findOne(id);
    }

}
