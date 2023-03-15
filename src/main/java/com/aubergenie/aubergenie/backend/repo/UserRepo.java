package com.aubergenie.aubergenie.backend.repo;

import com.aubergenie.aubergenie.backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
