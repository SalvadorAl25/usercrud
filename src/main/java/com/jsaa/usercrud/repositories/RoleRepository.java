package com.jsaa.usercrud.repositories;

import com.jsaa.usercrud.models.RolesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RolesEntity, Long> {
}
