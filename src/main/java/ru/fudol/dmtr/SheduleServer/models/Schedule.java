package ru.fudol.dmtr.SheduleServer.models;

import jakarta.persistence.*;

@Entity
@Table(name = "schedule")
public class Schedule {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne()
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group group;

    @ManyToOne()
    @JoinColumn(name = "day_id", referencedColumnName = "id")
    private Week week;

    @ManyToOne()
    @JoinColumn(name = "first_subject_id", referencedColumnName = "id")
    private Subject subjectFirst;

    @ManyToOne()
    @JoinColumn(name = "first_time_id", referencedColumnName = "id")
    private TimeM firstTime;

    @ManyToOne()
    @JoinColumn(name = "second_subject_id", referencedColumnName = "id")
    private Subject subjectSecond;

    @ManyToOne()
    @JoinColumn(name = "second_time_id", referencedColumnName = "id")
    private TimeM secondTime;

    @ManyToOne()
    @JoinColumn(name = "third_subject_id", referencedColumnName = "id")
    private Subject subjectThird;

    @ManyToOne()
    @JoinColumn(name = "third_time_id", referencedColumnName = "id")
    private TimeM thirdTime;

    @ManyToOne()
    @JoinColumn(name = "fourth_subject_id", referencedColumnName = "id")
    private Subject subjectFourth;

    @ManyToOne()
    @JoinColumn(name = "fourth_time_id", referencedColumnName = "id")
    private TimeM fourthTime;

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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Week getWeek() {
        return week;
    }

    public void setWeek(Week week) {
        this.week = week;
    }

    public Subject getSubjectFirst() {
        return subjectFirst;
    }

    public void setSubjectFirst(Subject subjectFirst) {
        this.subjectFirst = subjectFirst;
    }

    public TimeM getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(TimeM firstTime) {
        this.firstTime = firstTime;
    }

    public TimeM getSecondTime() {
        return secondTime;
    }

    public void setSecondTime(TimeM secondTime) {
        this.secondTime = secondTime;
    }

    public TimeM getThirdTime() {
        return thirdTime;
    }

    public void setThirdTime(TimeM thirdTime) {
        this.thirdTime = thirdTime;
    }

    public TimeM getFourthTime() {
        return fourthTime;
    }

    public void setFourthTime(TimeM fourthTime) {
        this.fourthTime = fourthTime;
    }

    public Subject getSubjectSecond() {
        return subjectSecond;
    }

    public void setSubjectSecond(Subject subjectSecond) {
        this.subjectSecond = subjectSecond;
    }

    public Subject getSubjectThird() {
        return subjectThird;
    }

    public void setSubjectThird(Subject subjectThird) {
        this.subjectThird = subjectThird;
    }

    public Subject getSubjectFourth() {
        return subjectFourth;
    }

    public void setSubjectFourth(Subject subjectFourth) {
        this.subjectFourth = subjectFourth;
    }

    public int getWeekType() {
        return weekType;
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
