package com.jsaa.usercrud.services;

import com.jsaa.usercrud.models.RolesEntity;
import com.jsaa.usercrud.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public ArrayList<RolesEntity> findAllRoles(){
        return (ArrayList<RolesEntity>) roleRepository.findAll();
    }

    public void saveRole (RolesEntity role){
        roleRepository.save(role);
    }

    public void deleteRole(RolesEntity role){
        roleRepository.delete(role);
    }
}
