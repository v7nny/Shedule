package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;

import java.util.List;

/**
 * Модель для преподавателей
 * @autor Dmitry Fugol
 */

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @OneToMany(mappedBy = "teacher")
    private List<Subject> subjectList;



    public Teacher() {}

    public Teacher(String fullName) {
        this.fullName = fullName;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                '}';
    }
}
