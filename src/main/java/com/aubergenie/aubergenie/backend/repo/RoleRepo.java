package com.aubergenie.aubergenie.backend.repo;

import com.aubergenie.aubergenie.backend.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);

}
