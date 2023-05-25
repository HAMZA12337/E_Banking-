package com.example.security.sec.repositories;

import com.example.security.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser, Long> {
   public AppUser findByUsername(String username);
}
