package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.Teacher;

/**
 * Репозиторий для преподавателей
 * @autor Dmitry Fugol
 */

@Repository
public interface TeachersRepository extends JpaRepository<Teacher, Integer> {
}
