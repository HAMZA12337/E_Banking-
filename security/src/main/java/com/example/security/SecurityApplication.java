package com.example.security;

import com.example.security.sec.Services.AccountService;
import com.example.security.sec.entities.AppRole;
import com.example.security.sec.entities.AppUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true)
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder (){
        return  new BCryptPasswordEncoder();
    }
   // @Bean
    CommandLineRunner start(AccountService accountService){
        return args -> {
            accountService.addNewRole(new AppRole(null, "USER"));
            accountService.addNewRole(new AppRole(null,"ADMIN"));
            accountService.addNewRole(new AppRole(null,"CUSTOMER_MANAGER"));
            accountService.addNewRole(new AppRole(null,"PRODUCT_MANAGER"));
            accountService.addNewRole(new AppRole(null,"BILLS_MANAGER"));
            accountService.addNewUser(new AppUser(null,"user1","1234",new ArrayList<>()) );
            accountService.addNewUser(new AppUser(null,"admin","1234",new ArrayList<>()) );
            accountService.addNewUser(new AppUser(null,"user3","1234",new ArrayList<>()) );
            accountService.addNewUser(new AppUser(null,"user4","1234",new ArrayList<>()) );
            accountService.addNewUser(new AppUser(null,"user5","1234",new ArrayList<>()) );

            accountService.addRoleToUser("user1","USER");

            accountService.addRoleToUser("admin","USER");
            accountService.addRoleToUser("admin","ADMIN");

            accountService.addRoleToUser("user5","USER");
            accountService.addRoleToUser("user5","CUSTOMER_MANAGER");

            accountService.addRoleToUser("user3","USER");
            accountService.addRoleToUser("user3","PRODUCT_MANAGER");

            accountService.addRoleToUser("user4","USER");
            accountService.addRoleToUser("user4","BILLS_MANAGER");





        };

    }



}
