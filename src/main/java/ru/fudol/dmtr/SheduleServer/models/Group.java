package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;
import java.util.List;

/**
 * Модель для групп
 * @autor Dmitry Fugol
 */

@Entity
@Table(name = "groups_std")
public class Group {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "group_name")
    private String name;

    @Column(name = "group_course")
    private int course;

    @ManyToOne()
    @JoinColumn(name = "specialization_id", referencedColumnName = "id")
    private Specialization specializationGroup;

    @OneToMany(mappedBy = "group")
    private List<Schedule> scheduleList;



    public Group() {}

    public Group(String name, int course) {
        this.name = name;
        this.course = course;
    }



    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Specialization getSpecializationGroup() {
        return specializationGroup;
    }

    public void setSpecializationGroup(Specialization specializationGroup) {
        this.specializationGroup = specializationGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
