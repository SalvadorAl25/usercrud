package com.jsaa.usercrud.repositories;

import com.jsaa.usercrud.models.IssuesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IssuesRepository extends CrudRepository<IssuesEntity, Long> {

    @Query("select i from IssuesEntity i join i.user u where u.userId=:userId")
    List<IssuesEntity> findIssuesByUser(@Param("userId") Long userId);

    @Query("select i from IssuesEntity i where i.dateCreate=:dateCreate")
    List<IssuesEntity> findIssuesByCreateDate(@Param("dateCreate") LocalDate dateCreate);

    @Query("select i from IssuesEntity i where i.tittle=:tittle")
    List<IssuesEntity> findIssuesByTittle(@Param("tittle") String tittle);

    @Query("select i from IssuesEntity i where i.dateCreate BETWEEN :dateStart AND :dateFinish")
    List<IssuesEntity> findIssuesBetweenDates(@Param("dateStart") LocalDate dateStart,
                                              @Param("dateFinish") LocalDate dateFinish);
}
