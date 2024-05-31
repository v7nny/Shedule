package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.Week;
import ru.fudol.dmtr.SheduleServer.repositories.WeeksRepository;
import ru.fudol.dmtr.SheduleServer.services.WeeksService;

import java.util.List;

@RestController
@RequestMapping("/weeks")
public class WeeksController {

    private final WeeksService weeksService;

    @Autowired
    public WeeksController(WeeksService weeksService) {
        this.weeksService = weeksService;
    }

    @GetMapping
    public List<Week> getAll() {
        return weeksService.findAll();
    }

    @GetMapping("/{id}")
    public Week getOne(@PathVariable("id") int id) {
        return weeksService.findOne(id);
    }
}
