package com.zarguan.ebanking.sec.repositories;

import com.zarguan.ebanking.sec.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AppUserRepository extends JpaRepository<AppUser, Long> {
   public AppUser findByUsername(String username);
}
