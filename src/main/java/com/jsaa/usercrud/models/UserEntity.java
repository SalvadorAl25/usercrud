package com.jsaa.usercrud.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long userId;

    private String userName;

    private String userLastName;

    private String userEmail;

    private Boolean status;

    private String imgProfile;

    private LocalDate dateBirthday;

    private String country;

    private String state;

    private String city;

    private String address;

    private String rfc;

    @ManyToOne
    @JoinColumn(name = "roleId")
    private RolesEntity role;

    public UserEntity() {
    }

    public UserEntity(Long userId, String userName, String userLastName, String userEmail, Boolean status, String imgProfile, LocalDate dateBirthday, String country, String state, String city, String address, String rfc, RolesEntity role) {
        this.userId = userId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.status = status;
        this.imgProfile = imgProfile;
        this.dateBirthday = dateBirthday;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.rfc = rfc;
        this.role = role;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getImgProfile() {
        return imgProfile;
    }

    public void setImgProfile(String imgProfile) {
        this.imgProfile = imgProfile;
    }

    public LocalDate getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(LocalDate dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public RolesEntity getRole() {
        return role;
    }

    public void setRole(RolesEntity role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", status=" + status +
                ", imgProfile='" + imgProfile + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", rfc='" + rfc + '\'' +
                ", role=" + role +
                '}';
    }
}
