package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.Schedule;
import ru.fudol.dmtr.SheduleServer.services.SchedulesService;

import java.util.List;

@RestController
@RequestMapping("/shedules")
public class ScheduleController {

    private final SchedulesService schedulesService;

    @Autowired
    public ScheduleController(SchedulesService schedulesService) {
        this.schedulesService = schedulesService;
    }

    @GetMapping
    public List<Schedule> getAll() {
        return schedulesService.findAll();
    }

    @GetMapping("/{id}")
    public Schedule getOne(@PathVariable("id") int id) {
        return schedulesService.findOne(id);
    }

    @GetMapping("/groups/{id}")
    public List<Schedule> getAllByGroup(@PathVariable("id") int id) {
        return schedulesService.findByGroup(id);
    }
}
