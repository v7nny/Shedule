package ru.fudol.dmtr.SheduleServer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.fudol.dmtr.SheduleServer.models.Specialization;
import ru.fudol.dmtr.SheduleServer.services.SpecializationsService;

import java.util.List;

@RestController
@RequestMapping("/specializations")
public class SpecializationsController {

    private final SpecializationsService specializationsService;


    @Autowired
    public SpecializationsController(SpecializationsService specializationsService) {
        this.specializationsService = specializationsService;
    }

    @GetMapping
    public List<Specialization> getAll() {
        return specializationsService.findAll();
    }

    @GetMapping("/{id}")
    public Specialization getOne(@PathVariable("id") int id){
        return specializationsService.findOne(id);
    }



}
