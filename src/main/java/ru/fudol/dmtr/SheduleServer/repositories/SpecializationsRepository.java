package ru.fudol.dmtr.SheduleServer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.fudol.dmtr.SheduleServer.models.Specialization;

@Repository
public interface SpecializationsRepository extends JpaRepository<Specialization, Integer> {
}
