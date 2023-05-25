package com.example.security.sec.repositories;

import com.example.security.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppRoleRepository extends JpaRepository <AppRole, Long> {
    public  AppRole findByRolename (String roleName );}
