package com.jsaa.usercrud.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "issues")
public class IssuesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long issuesId;

    private String tittle;

    private LocalDate dateCreate;

    private LocalDate dateFinish;

    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId")
    private UserEntity user;

    public IssuesEntity() {
    }

    public IssuesEntity(Long issuesId, String tittle, LocalDate dateCreate, LocalDate dateFinish, String description, UserEntity user) {
        this.issuesId = issuesId;
        this.tittle = tittle;
        this.dateCreate = dateCreate;
        this.dateFinish = dateFinish;
        this.description = description;
        this.user = user;
    }

    public Long getIssuesId() {
        return issuesId;
    }

    public void setIssuesId(Long issuesId) {
        this.issuesId = issuesId;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public LocalDate getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(LocalDate dateFinish) {
        this.dateFinish = dateFinish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "IssuesEntity{" +
                "issuesId=" + issuesId +
                ", tittle='" + tittle + '\'' +
                ", dateCreate=" + dateCreate +
                ", dateFinish=" + dateFinish +
                ", description='" + description + '\'' +
                ", user=" + user +
                '}';
    }
}
