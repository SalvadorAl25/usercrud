package com.jsaa.usercrud.models;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "schedules")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long scheduleId;

    /*Lunes*/
    private LocalTime monIn;

    private LocalTime monBreak;

    private LocalTime monExit;

    /*Martes*/
    private LocalTime tueIn;

    private LocalTime tueBreak;

    private LocalTime tueExit;

    /*Miercoles*/
    private LocalTime wedIn;

    private LocalTime wedBreak;

    private LocalTime wedExit;

    /*Jueves*/
    private LocalTime thuIn;

    private LocalTime thuBreak;

    private LocalTime thuExit;

    /*Viernes*/
    private LocalTime friIn;

    private LocalTime friBreak;

    private LocalTime friExit;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private UserEntity user;

    public ScheduleEntity() {
    }

    public ScheduleEntity(Long scheduleId, LocalTime monIn, LocalTime monBreak, LocalTime monExit, LocalTime tueIn, LocalTime tueBreak, LocalTime tueExit, LocalTime wedIn, LocalTime wedBreak, LocalTime wedExit, LocalTime thuIn, LocalTime thuBreak, LocalTime thuExit, LocalTime friIn, LocalTime friBreak, LocalTime friExit, UserEntity user) {
        this.scheduleId = scheduleId;
        this.monIn = monIn;
        this.monBreak = monBreak;
        this.monExit = monExit;
        this.tueIn = tueIn;
        this.tueBreak = tueBreak;
        this.tueExit = tueExit;
        this.wedIn = wedIn;
        this.wedBreak = wedBreak;
        this.wedExit = wedExit;
        this.thuIn = thuIn;
        this.thuBreak = thuBreak;
        this.thuExit = thuExit;
        this.friIn = friIn;
        this.friBreak = friBreak;
        this.friExit = friExit;
        this.user = user;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public LocalTime getMonIn() {
        return monIn;
    }

    public void setMonIn(LocalTime monIn) {
        this.monIn = monIn;
    }

    public LocalTime getMonBreak() {
        return monBreak;
    }

    public void setMonBreak(LocalTime monBreak) {
        this.monBreak = monBreak;
    }

    public LocalTime getMonExit() {
        return monExit;
    }

    public void setMonExit(LocalTime monExit) {
        this.monExit = monExit;
    }

    public LocalTime getTueIn() {
        return tueIn;
    }

    public void setTueIn(LocalTime tueIn) {
        this.tueIn = tueIn;
    }

    public LocalTime getTueBreak() {
        return tueBreak;
    }

    public void setTueBreak(LocalTime tueBreak) {
        this.tueBreak = tueBreak;
    }

    public LocalTime getTueExit() {
        return tueExit;
    }

    public void setTueExit(LocalTime tueExit) {
        this.tueExit = tueExit;
    }

    public LocalTime getWedIn() {
        return wedIn;
    }

    public void setWedIn(LocalTime wedIn) {
        this.wedIn = wedIn;
    }

    public LocalTime getWedBreak() {
        return wedBreak;
    }

    public void setWedBreak(LocalTime wedBreak) {
        this.wedBreak = wedBreak;
    }

    public LocalTime getWedExit() {
        return wedExit;
    }

    public void setWedExit(LocalTime wedExit) {
        this.wedExit = wedExit;
    }

    public LocalTime getThuIn() {
        return thuIn;
    }

    public void setThuIn(LocalTime thuIn) {
        this.thuIn = thuIn;
    }

    public LocalTime getThuBreak() {
        return thuBreak;
    }

    public void setThuBreak(LocalTime thuBreak) {
        this.thuBreak = thuBreak;
    }

    public LocalTime getThuExit() {
        return thuExit;
    }

    public void setThuExit(LocalTime thuExit) {
        this.thuExit = thuExit;
    }

    public LocalTime getFriIn() {
        return friIn;
    }

    public void setFriIn(LocalTime friIn) {
        this.friIn = friIn;
    }

    public LocalTime getFriBreak() {
        return friBreak;
    }

    public void setFriBreak(LocalTime friBreak) {
        this.friBreak = friBreak;
    }

    public LocalTime getFriExit() {
        return friExit;
    }

    public void setFriExit(LocalTime friExit) {
        this.friExit = friExit;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ScheduleEntity{" +
                "scheduleId=" + scheduleId +
                ", monIn=" + monIn +
                ", monBreak=" + monBreak +
                ", monExit=" + monExit +
                ", tueIn=" + tueIn +
                ", tueBreak=" + tueBreak +
                ", tueExit=" + tueExit +
                ", wedIn=" + wedIn +
                ", wedBreak=" + wedBreak +
                ", wedExit=" + wedExit +
                ", thuIn=" + thuIn +
                ", thuBreak=" + thuBreak +
                ", thuExit=" + thuExit +
                ", friIn=" + friIn +
                ", friBreak=" + friBreak +
                ", friExit=" + friExit +
                ", user=" + user +
                '}';
    }
}
