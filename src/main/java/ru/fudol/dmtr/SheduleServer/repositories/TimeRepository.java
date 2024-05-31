package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.TimeM;

@Repository
public interface TimeRepository extends JpaRepository<TimeM, Integer> {
}
