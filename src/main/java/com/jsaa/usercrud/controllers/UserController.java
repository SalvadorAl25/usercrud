package com.jsaa.usercrud.controllers;

import com.jsaa.usercrud.models.UserEntity;
import com.jsaa.usercrud.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @GetMapping(path = "users")
    public ArrayList<UserEntity> findAll(){
        return userService.findAllUsers();
    }

    @CrossOrigin
    @GetMapping(path = "user/{userId}")
    public Optional<UserEntity> findById(@PathVariable("userId") Long userId){
        return userService.findByUserId(userId);
    }

    @CrossOrigin
    @GetMapping(path = "user/filter/status/{status}")
    public List<UserEntity> findByStatus(@PathVariable("status") Boolean status) {
        return userService.findUsersByStatus(status);
    }

    @CrossOrigin
    @GetMapping(path = "user/filter/role/{roleName}")
    public List<UserEntity> findByRole(@PathVariable("roleName") String roleName) {
        return userService.findUsersByRoleName(roleName);
    }

    @CrossOrigin
    @GetMapping(path = "user/filter/{status}/{roleName}")
    public List<UserEntity> findByRoleAndAndStatus(@PathVariable("status") Boolean status,
                                                   @PathVariable("roleName") String roleName) {
        return userService.findByRoleAndAndStatus(status, roleName);
    }

    @CrossOrigin
    @PostMapping(path = "user")
    public void saveUser(@RequestBody UserEntity user){
        userService.saveUser(user);
    }

    @CrossOrigin
    @PostMapping(path = "multUsers")
    public void saveMultiUsers(@RequestBody List<UserEntity> users){
        userService.saveMultiUsers(users);
    }

    @CrossOrigin
    @DeleteMapping(path = "user")
    public void deleteUser(@RequestBody UserEntity user){
        userService.deleteUser(user);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al procesar la solicitud");
    }
}
