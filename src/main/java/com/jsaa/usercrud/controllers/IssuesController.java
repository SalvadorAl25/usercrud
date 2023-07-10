package com.jsaa.usercrud.controllers;

import com.jsaa.usercrud.models.IssuesEntity;
import com.jsaa.usercrud.services.IssuesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class IssuesController {

    @Autowired
    IssuesService issuesService;

    @CrossOrigin
    @GetMapping(path = "issues")
    public Iterable<IssuesEntity> findAll() {
        return issuesService.findAll();
    }

    @CrossOrigin
    @GetMapping(path = "issue/{issuesId}")
    public Optional<IssuesEntity> findById(Long aLong) {
        return issuesService.findById(aLong);
    }

    @CrossOrigin
    @GetMapping(path = "issues/user/{userId}")
    public List<IssuesEntity> findIssuesByUser(@PathVariable("userId") Long userId){
        return issuesService.findIssuesByUser(userId);
    }

    @CrossOrigin
    @GetMapping(path = "issues/createFrom/{dateCreate}")
    public List<IssuesEntity> findIssuesByCreateDate(@PathVariable("dateCreate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dateCreate){
        return issuesService.findIssuesByCreateDate(dateCreate);
    }

    @CrossOrigin
    @GetMapping(path = "issues/filter/{tittle}")
    public List<IssuesEntity> findIssuesByTittle(@PathVariable("tittle") String tittle){
        return issuesService.findIssuesByTittle(tittle);
    }

    @CrossOrigin
    @GetMapping(path = "issues/between/{dateStart}&{dateFinish}")
    public List<IssuesEntity> findIssuesBetweenDates(@PathVariable("dateStart") @DateTimeFormat (iso = DateTimeFormat.ISO.DATE) LocalDate dateStart,
                                                     @PathVariable("dateFinish") @DateTimeFormat (iso = DateTimeFormat.ISO.DATE) LocalDate dateFinish){
        return issuesService.findIssuesBetweenDates(dateStart,dateFinish);
    }

    @CrossOrigin
    @PostMapping(path = "issue")
    public void saveIssue(@RequestBody IssuesEntity issue){
        issuesService.saveIssue(issue);
    }

    @CrossOrigin
    @DeleteMapping(path = "issue")
    public void deleteUser(@RequestBody IssuesEntity issue){
        issuesService.deleteUser(issue);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la solicitud");
    }
}
