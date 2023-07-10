package com.jsaa.usercrud.services;

import com.jsaa.usercrud.models.IssuesEntity;
import com.jsaa.usercrud.repositories.IssuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class IssuesService {

    @Autowired
    IssuesRepository issuesRepository;

    public Iterable<IssuesEntity> findAll() {
        return issuesRepository.findAll();
    }

    public Optional<IssuesEntity> findById(Long aLong) {
        return issuesRepository.findById(aLong);
    }

    public List<IssuesEntity> findIssuesByUser(Long userId){
        return issuesRepository.findIssuesByUser(userId);
    }

    public List<IssuesEntity> findIssuesByCreateDate(LocalDate dateCreate){
        return issuesRepository.findIssuesByCreateDate(dateCreate);
    }

    public List<IssuesEntity> findIssuesByTittle(String tittle){
        return issuesRepository.findIssuesByTittle(tittle);
    }

    public List<IssuesEntity> findIssuesBetweenDates(LocalDate dateStart, LocalDate dateFinish){
        return issuesRepository.findIssuesBetweenDates(dateStart,dateFinish);
    }

    public <S extends IssuesEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return issuesRepository.saveAll(entities);
    }

    public void saveIssue(IssuesEntity issue){
        issuesRepository.save(issue);
    }

    public void deleteUser(IssuesEntity issue){
        issuesRepository.delete(issue);
    }
}
