package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.Subject;

/**
 * Репозиторий для предметов
 * @autor Dmitry Fugol
 */

@Repository
public interface SubjectsRepository extends JpaRepository<Subject, Integer> {
}
