package com.jsaa.usercrud.repositories;

import com.jsaa.usercrud.models.ScheduleEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ScheduleRepository extends CrudRepository<ScheduleEntity, Long> {

    @Query("select s from ScheduleEntity s join s.user u where u.userId=:userId")
    Optional<ScheduleEntity> findScheduleByUser(@Param("userId") Long userId);
}
