package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;

/**
 * Модель для времени занятий
 * @autor Dmitry Fugol
 */

@Entity
@Table(name = "time_std")
public class TimeM {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hh_mm")
    private Time time;

    @OneToMany(mappedBy = "time")
    private List<Schedule> schedule;


    public TimeM() {}

    public TimeM(Time time) {
        this.time = time;
    }



    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "TimeM{" +
                "id=" + id +
                ", time='" + time + '\'' +
                '}';
    }
}
