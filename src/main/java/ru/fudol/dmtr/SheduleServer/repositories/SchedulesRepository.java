package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.Group;
import ru.fudol.dmtr.SheduleServer.models.Schedule;

import java.util.List;

@Repository
public interface SchedulesRepository extends JpaRepository<Schedule, Integer> {

    List<Schedule> findByGroupId(int id);
}
