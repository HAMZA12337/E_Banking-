package com.zarguan.ebanking.sec.repositories;

import com.zarguan.ebanking.sec.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppRoleRepository extends JpaRepository <AppRole, Long> {
    public  AppRole findByRolename (String roleName );}
