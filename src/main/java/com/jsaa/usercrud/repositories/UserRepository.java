package com.jsaa.usercrud.repositories;

import com.jsaa.usercrud.models.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

    @Query("select u from UserEntity u  where u.status=:status")
    List<UserEntity> findUsersByStatus(@Param("status") Boolean status);

    @Query("select u from UserEntity u join u.role r where r.roleName=:roleName")
    List<UserEntity> findUsersByRoleName(@Param("roleName") String roleName);

    @Query("select u from UserEntity u join u.role r where u.status=:status and r.roleName=:roleName")
    List<UserEntity> findByRoleAndAndStatus(@Param("status") Boolean status,
                                            @Param("roleName") String roleName);
}
