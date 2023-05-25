package com.zarguan.ebanking.sec.Services;


import com.zarguan.ebanking.sec.entities.AppRole;
import com.zarguan.ebanking.sec.entities.AppUser;

import java.util.List;


public interface AccountService {
    AppUser addNewUser (AppUser appUser );
    AppRole addNewRole (AppRole appRole);
    void addRoleToUser(String username , String  roleName);
    AppUser loadUserByUsername(String username);
    List< AppUser > listUser();

}
