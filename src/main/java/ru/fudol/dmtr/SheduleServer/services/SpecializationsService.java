package ru.fudol.dmtr.SheduleServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fudol.dmtr.SheduleServer.models.Specialization;
import ru.fudol.dmtr.SheduleServer.repositories.GroupsRepository;
import ru.fudol.dmtr.SheduleServer.repositories.SpecializationsRepository;

import java.util.List;

/**
 * Сервис для специализаций групп с CRUD методами
 * @autor Dmitry Fugol
 */

@Service
@Transactional(readOnly = true)
public class SpecializationsService {
    private final SpecializationsRepository specializationsRepository;


    @Autowired
    public SpecializationsService(SpecializationsRepository specializationsRepository) {
        this.specializationsRepository = specializationsRepository;
    }



    public List<Specialization> findAll() {
        return specializationsRepository.findAll();
    }

    public Specialization findOne(int id) {
        return specializationsRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Specialization specialization) {
        specializationsRepository.save(specialization);
    }

    @Transactional
    public void update(int id, Specialization updatedSpecialization) {
        updatedSpecialization.setId(id);
        specializationsRepository.save(updatedSpecialization);
    }

    @Transactional
    public void delete(int id) {
        specializationsRepository.deleteById(id);
    }
}
