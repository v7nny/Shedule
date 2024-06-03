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
    private String specAbbreviation;

    @OneToMany(mappedBy = "specializationGr")
    private List<Group> groupsList;

    @OneToMany(mappedBy = "specializationSb")
    private List<Subject> subjectList;


    public Specialization() {}

    public Specialization( String name, String specAbbreviation) {
        this.name = name;
        this.specAbbreviation = specAbbreviation;
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

    public String getSpecAbbreviation() {
        return specAbbreviation;
    }

    public void setSpecAbbreviation(String specAbbreviation) {
        this.specAbbreviation = specAbbreviation;
    }


    @Override
    public String toString() {
        return "Specialization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specAbbreviation='" + specAbbreviation + '\'' +
                '}';
    }
}
