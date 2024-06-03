package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.Week;

/**
 * Репозиторий для дней недели
 * @autor Dmitry Fugol
 */

@Repository
public interface WeeksRepository extends JpaRepository<Week, Integer> {
}
