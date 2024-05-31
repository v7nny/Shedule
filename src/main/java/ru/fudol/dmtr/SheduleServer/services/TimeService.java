package ru.fudol.dmtr.SheduleServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fudol.dmtr.SheduleServer.models.TimeM;
import ru.fudol.dmtr.SheduleServer.repositories.TimeRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class TimeService {
    private final TimeRepository timeRepository;


    @Autowired
    public TimeService(TimeRepository timeRepository) {
        this.timeRepository = timeRepository;
    }



    public List<TimeM> findAll() {
        return timeRepository.findAll();
    }

    public TimeM findOne(int id) {
        return timeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(TimeM time) {
        timeRepository.save(time);
    }

    @Transactional
    public void update(int id, TimeM updatedTime) {
        updatedTime.setId(id);
        timeRepository.save(updatedTime);
    }

    @Transactional
    public void delete(int id) {
        timeRepository.deleteById(id);
    }
}
