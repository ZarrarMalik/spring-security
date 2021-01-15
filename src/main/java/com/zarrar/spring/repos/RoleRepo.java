package com.zarrar.spring.repos;

import com.zarrar.spring.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
