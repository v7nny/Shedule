package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.Week;
import ru.fudol.dmtr.SheduleServer.services.WeeksService;
import java.util.List;

/**
 * Контроллер возвращает все дни недели/один день недели по его id
 * @autor Dmitry Fugol
 */

@RestController
@RequestMapping("/week")
public class WeekController {

    private final WeeksService weeksService;

    @Autowired
    public WeekController(WeeksService weeksService) {
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
