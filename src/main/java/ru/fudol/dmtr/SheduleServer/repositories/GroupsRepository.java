package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.Group;

import java.util.List;

/**
 * Репозиторий для групп
 * @autor Dmitry Fugol
 */

@Repository
public interface GroupsRepository extends JpaRepository<Group, Integer> {
    List<Group> findBySpecializationGroupNameAndCourse(String specializationName,
                                                       int course);
    Group findByNameAndCourse(String name, int course);
}
