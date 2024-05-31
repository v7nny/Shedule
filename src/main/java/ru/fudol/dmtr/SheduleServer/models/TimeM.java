package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.List;


@Entity
@Table(name = "time_std")
public class TimeM {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "hh_mm")
    private Time time;

    @OneToMany(mappedBy = "firstTime")
    private List<Schedule> scheduleFirst;

    @OneToMany(mappedBy = "secondTime")
    private List<Schedule> scheduleSecond;

    @OneToMany(mappedBy = "thirdTime")
    private List<Schedule> scheduleThird;

    @OneToMany(mappedBy = "fourthTime")
    private List<Schedule> scheduleFourth;


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
