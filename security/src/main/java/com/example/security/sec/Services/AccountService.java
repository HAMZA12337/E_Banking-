package com.example.security.sec.Services;


import com.example.security.sec.entities.AppRole;
import com.example.security.sec.entities.AppUser;

import java.util.List;


public interface AccountService {
    AppUser addNewUser (AppUser appUser );
    AppRole addNewRole (AppRole appRole);
    void addRoleToUser(String username , String  roleName);
    AppUser loadUserByUsername(String username);
    List< AppUser > listUser();

}
