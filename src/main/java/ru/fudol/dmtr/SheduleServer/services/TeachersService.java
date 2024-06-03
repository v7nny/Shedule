package ru.fudol.dmtr.SheduleServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fudol.dmtr.SheduleServer.models.Teacher;
import ru.fudol.dmtr.SheduleServer.repositories.TeachersRepository;
import java.util.List;

/**
 * Сервис для преподавателей с CRUD методами
 * @autor Dmitry Fugol
 */

@Service
@Transactional(readOnly = true)
public class TeachersService {
    private final TeachersRepository teachersRepository;


    @Autowired
    public TeachersService(TeachersRepository teachersRepository) {
        this.teachersRepository = teachersRepository;
    }



    public List<Teacher> findAll() {
        return teachersRepository.findAll();
    }

    public Teacher findOne(int id) {
        return teachersRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Teacher teacher) {
        teachersRepository.save(teacher);
    }

    @Transactional
    public void update(int id, Teacher updatedTeacher) {
        updatedTeacher.setId(id);
        teachersRepository.save(updatedTeacher);
    }

    @Transactional
    public void delete(int id) {
        teachersRepository.deleteById(id);
    }
}
