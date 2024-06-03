package ru.fudol.dmtr.SheduleServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fudol.dmtr.SheduleServer.models.Week;
import ru.fudol.dmtr.SheduleServer.repositories.WeeksRepository;
import java.util.List;

/**
 * Сервис для дней недели с CRUD методами
 * @autor Dmitry Fugol
 */

@Service
@Transactional(readOnly = true)
public class WeeksService {
    private final WeeksRepository weeksRepository;


    @Autowired
    public WeeksService(WeeksRepository weeksRepository) {
        this.weeksRepository = weeksRepository;
    }



    public List<Week> findAll() {
        return weeksRepository.findAll();
    }

    public Week findOne(int id) {
        return weeksRepository.findById(id).orElse(null);
    }

    @Transactional
    public void save(Week week) {
        weeksRepository.save(week);
    }

    @Transactional
    public void update(int id, Week updatedWeek) {
        updatedWeek.setId(id);
        weeksRepository.save(updatedWeek);
    }

    @Transactional
    public void delete(int id) {
        weeksRepository.deleteById(id);
    }
}
