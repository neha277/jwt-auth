package com.aubergenie.aubergenie.backend.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

import static jakarta.persistence.FetchType.EAGER;
import static jakarta.persistence.GenerationType.AUTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User{
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    @ManyToMany(fetch = EAGER )
    private Collection<Role> roles = new ArrayList<>();


}
