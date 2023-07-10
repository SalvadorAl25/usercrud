package com.jsaa.usercrud.controllers;

import com.jsaa.usercrud.models.RolesEntity;
import com.jsaa.usercrud.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @CrossOrigin
    @GetMapping(path = "roles")
    public ArrayList<RolesEntity> findAll(){
        return roleService.findAllRoles();
    }

    @CrossOrigin
    @PostMapping(path = "role")
    public void saveRole (@RequestBody RolesEntity role){
        roleService.saveRole(role);
    }

    @CrossOrigin
    @DeleteMapping(path = "role")
    public void deleteRole(@RequestBody RolesEntity role){
        roleService.deleteRole(role);
    }
}
