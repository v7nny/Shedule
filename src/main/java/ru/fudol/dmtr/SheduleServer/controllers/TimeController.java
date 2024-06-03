package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.TimeM;
import ru.fudol.dmtr.SheduleServer.services.TimeService;

import java.util.List;
/**
 * Контроллер возвращает список с временем начала занятий/время занятия по id
 * @autor Dmitry Fugol
 */
@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;


    @Autowired
    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping
    public List<TimeM> getAll() {
        return timeService.findAll();
    }


    @GetMapping("/{id}")
    public TimeM getOne(@PathVariable("id") int id) {
        return timeService.findOne(id);
    }
}
