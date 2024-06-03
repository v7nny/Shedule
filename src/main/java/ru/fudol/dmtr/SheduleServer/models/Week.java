package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;
import java.util.List;

/**
 * Модель для дней недели
 * @autor Dmitry Fugol
 */

@Entity
@Table(name = "weeks")
public class Week {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "day_name")
    private String name;

    @OneToMany(mappedBy = "week")
    private List<Schedule> scheduleList;


    public Week() {}

    public Week(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Week{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
