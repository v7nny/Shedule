package ru.fudol.dmtr.SheduleServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fudol.dmtr.SheduleServer.models.Group;
import ru.fudol.dmtr.SheduleServer.models.Subject;
import ru.fudol.dmtr.SheduleServer.repositories.GroupsRepository;
import ru.fudol.dmtr.SheduleServer.repositories.SubjectsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class SubjectsService {

    private final SubjectsRepository subjectsRepository;


    @Autowired
    public SubjectsService(SubjectsRepository subjectsRepository) {
        this.subjectsRepository = subjectsRepository;
    }



    public List<Subject> findAll() {
        return subjectsRepository.findAll();
    }

    public Subject findOne(int id) {
        return subjectsRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Subject subject) {
        subjectsRepository.save(subject);
    }

    @Transactional
    public void update(int id, Subject updatedSubject) {
        updatedSubject.setId(id);
        subjectsRepository.save(updatedSubject);
    }

    @Transactional
    public void delete(int id) {
        subjectsRepository.deleteById(id);
    }
}
