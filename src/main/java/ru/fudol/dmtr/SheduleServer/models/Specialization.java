package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;
import java.util.List;

/**
 * Модель для специализаций групп
 * @autor Dmitry Fugol
 */

@Entity
@Table(name = "specializations")
public class Specialization {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "specialization_name")
    private String name;

    @Column(name = "specialization_abbreviation")
    private String specializationAbbreviation;

    @OneToMany(mappedBy = "specializationGroup")
    private List<Group> groupsList;

    @OneToMany(mappedBy = "specializationSubjects")
    private List<Subject> subjectList;


    public Specialization() {}

    public Specialization( String name, String specAbbreviation) {
        this.name = name;
        this.specializationAbbreviation = specAbbreviation;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecializationAbbreviation() {
        return specializationAbbreviation;
    }

    public void setSpecializationAbbreviation(String specAbbreviation) {
        this.specializationAbbreviation = specAbbreviation;
    }


    @Override
    public String toString() {
        return "Specialization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specAbbreviation='" + specializationAbbreviation + '\'' +
                '}';
    }
}
