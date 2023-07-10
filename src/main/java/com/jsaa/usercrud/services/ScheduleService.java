package com.jsaa.usercrud.services;

import com.jsaa.usercrud.models.ScheduleEntity;
import com.jsaa.usercrud.repositories.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    public ArrayList<ScheduleEntity> findAllSchedules(){
        return (ArrayList<ScheduleEntity>) scheduleRepository.findAll();
    }

    public Optional<ScheduleEntity> findByScheduleId(Long scheduleId){
        return scheduleRepository.findById(scheduleId);
    }

    public Optional<ScheduleEntity> findScheduleByUser(Long userId){
        return scheduleRepository.findScheduleByUser(userId);
    }

    public void saveSchedule(ScheduleEntity schedule){
        scheduleRepository.save(schedule);
    }

    public void deleteSchedule(ScheduleEntity schedule){
        scheduleRepository.delete(schedule);
    }
}
