package com.aubergenie.aubergenie.backend.service;

import com.aubergenie.aubergenie.backend.domain.Role;
import com.aubergenie.aubergenie.backend.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String email,String roleName);
    User getUser(String email);
    List<User> getUsers();
}
