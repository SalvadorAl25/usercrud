package com.jsaa.usercrud.controllers;

import com.jsaa.usercrud.models.ScheduleEntity;
import com.jsaa.usercrud.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @CrossOrigin
    @GetMapping(path = "schedules")
    public ArrayList<ScheduleEntity> findAllSchedules(){
        return scheduleService.findAllSchedules();
    }

    @CrossOrigin
    @GetMapping(path = "schedule/{scheduleId}")
    public Optional<ScheduleEntity> findByScheduleId(@PathVariable("scheduleId") Long scheduleId){
        return scheduleService.findByScheduleId(scheduleId);
    }

    @CrossOrigin
    @GetMapping(path = "schedule/user/{userId}")
    public Optional<ScheduleEntity> findScheduleByUser(@PathVariable("userId") Long userId){
        return scheduleService.findScheduleByUser(userId);
    }

    @CrossOrigin
    @PostMapping(path = "schedule")
    public void saveSchedule(@RequestBody ScheduleEntity schedule){
        scheduleService.saveSchedule(schedule);
    }

    @CrossOrigin
    @DeleteMapping(path = "schedule")
    public void deleteSchedule(@RequestBody ScheduleEntity schedule){
        scheduleService.deleteSchedule(schedule);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la solicitud");
    }
}
