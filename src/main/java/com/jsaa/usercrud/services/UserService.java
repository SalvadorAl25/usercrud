package com.jsaa.usercrud.services;

import com.jsaa.usercrud.models.UserEntity;
import com.jsaa.usercrud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<UserEntity> findAllUsers(){
        return (ArrayList<UserEntity>) userRepository.findAll();
    }

    public Optional<UserEntity> findByUserId(Long userId){
        return userRepository.findById(userId);
    }

    public List<UserEntity> findUsersByStatus(Boolean status){
        return userRepository.findUsersByStatus(status);
    }

    public List<UserEntity> findUsersByRoleName(String roleName){
        return userRepository.findUsersByRoleName(roleName);
    }

    public List<UserEntity> findByRoleAndAndStatus(Boolean status, String roleName){
        return userRepository.findByRoleAndAndStatus(status,roleName);
    }

    public void saveUser(UserEntity user){
        userRepository.save(user);
    }

    public void saveMultiUsers(List<UserEntity> users){
        userRepository.saveAll(users);
    }

    public void deleteUser(UserEntity user){
        userRepository.delete(user);
    }
}
