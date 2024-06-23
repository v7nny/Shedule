package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;

/**
 * Модель для расписания
 * @autor Dmitry Fugol
 */

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group group;

    @ManyToOne()
    @JoinColumn(name = "week_id", referencedColumnName = "id")
    private Week week;

    @ManyToOne()
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    private Subject subject;

    @ManyToOne()
    @JoinColumn(name = "time_id", referencedColumnName = "id")
    private TimeM time;

    @Column(name = "week_type")
    private int weekType;



    public Schedule() {}

    public Schedule(int weekType) {
        this.weekType = weekType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Group getGroup() {
//        return group;
//    }
//
//    public void setGroup(Group group) {
//        this.group = group;
//    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public int getWeekType() {
        return weekType;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public TimeM getTime() {
        return time;
    }

    public void setTime(TimeM time) {
        this.time = time;
    }

    public void setWeekType(int weekType) {
        this.weekType = weekType;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "weekType=" + weekType +
                ", id=" + id +
                '}';
    }
}
