package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "subject_name")
    private String name;

    @Column(name = "subject_auditorium")
    private int auditorium;

    @ManyToOne()
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    @ManyToOne()
    @JoinColumn(name = "specialization_id", referencedColumnName = "id")
    private Specialization specializationSb;

    @OneToMany(mappedBy = "subjectFirst")
    private List<Schedule> scheduleFirst;

    @OneToMany(mappedBy = "subjectSecond")
    private List<Schedule> scheduleSecond;

    @OneToMany(mappedBy = "subjectThird")
    private List<Schedule> scheduleThird;

    @OneToMany(mappedBy = "subjectFourth")
    private List<Schedule> scheduleFourth;



    public Subject() {}

    public Subject(String name, int auditorium) {
        this.name = name;
        this.auditorium = auditorium;
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

    public int getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(int auditorium) {
        this.auditorium = auditorium;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Specialization getSpecializationSb() {
        return specializationSb;
    }

    public void setSpecializationSb(Specialization specialization) {
        this.specializationSb = specialization;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", auditorium=" + auditorium +
                '}';
    }
}
