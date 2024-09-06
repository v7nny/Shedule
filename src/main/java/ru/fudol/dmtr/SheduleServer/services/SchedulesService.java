package ru.fudol.dmtr.SheduleServer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fudol.dmtr.SheduleServer.models.Group;
import ru.fudol.dmtr.SheduleServer.models.Schedule;
import ru.fudol.dmtr.SheduleServer.repositories.GroupsRepository;
import ru.fudol.dmtr.SheduleServer.repositories.SchedulesRepository;
import java.util.List;

/**
 * Сервис для расписания с CRUD методами
 * @autor Dmitry Fugol
 */


@Service
@Transactional(readOnly = true)
public class SchedulesService {
    private final SchedulesRepository schedulesRepository;


    @Autowired
    public SchedulesService(SchedulesRepository schedulesRepository) {
        this.schedulesRepository = schedulesRepository;
    }



    public List<Schedule> findAll() {
        return schedulesRepository.findAll();
    }

    public Schedule findOne(int id) {
        return schedulesRepository.findById(id).orElse(null);
    }

    public List<Schedule> findByGroup(int id) {
        return schedulesRepository.findByGroupId(id);
    }

    public Schedule[][] findByGroupAndWeekType(int groupId, int weekType){
        Schedule[][] scheduleArray = new Schedule[6][3];

        for(int i = 1; i < 7; i++){
            scheduleArray[i - 1] = schedulesRepository.findByGroupIdAndWeekIdAndWeekType(groupId, i, weekType);
        }

        return scheduleArray;
    }

    @Transactional
    public void save(Schedule schedule) {
        schedulesRepository.save(schedule);
    }

    @Transactional
    public void update(int id, Schedule updatedSchedule) {
        updatedSchedule.setId(id);
        schedulesRepository.save(updatedSchedule);
    }

    @Transactional
    public void delete(int id) {
        schedulesRepository.deleteById(id);
    }
}
