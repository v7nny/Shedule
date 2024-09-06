package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.Schedule;
import java.util.List;

/**
 * Репозиторий для расписания
 * @autor Dmitry Fugol
 */

@Repository
public interface SchedulesRepository extends JpaRepository<Schedule, Integer> {
    //Метод для поиска расписания для конкретной группы по её id
    List<Schedule> findByGroupId(int id);
    Schedule[] findByGroupIdAndWeekIdAndWeekType(int groupId, int weekId, int weekType);
}
