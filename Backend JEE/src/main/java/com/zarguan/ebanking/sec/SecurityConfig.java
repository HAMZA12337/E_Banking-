package com.zarguan.ebanking.sec;
import com.zarguan.ebanking.sec.Services.AccountService;
import com.zarguan.ebanking.sec.Services.UserDetailsServiceImp;
import com.zarguan.ebanking.sec.entities.AppUser;
import com.zarguan.ebanking.sec.filters.JwtAuthenticationFilter;
import com.zarguan.ebanking.sec.filters.JwtAuthorizationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.util.ArrayList;
import java.util.Collection;
@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private UserDetailsServiceImp userDetailsServiceImp ;
    public SecurityConfig( UserDetailsServiceImp userDetailsServiceImp) {
        this.userDetailsServiceImp = userDetailsServiceImp;
    }

    @Override
    protected  void  configure(AuthenticationManagerBuilder auth) throws  Exception {
        auth.userDetailsService(userDetailsServiceImp);
    }

    @Override
    protected  void configure(HttpSecurity http )throws  Exception{
        /*http.headers().frameOptions().disable();
        http.csrf().disable();
        http.authorizeHttpRequests().anyRequest().permitAll();*/
        http.headers().frameOptions().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.csrf().disable();
        http.authorizeRequests().antMatchers("/h2-console/**").permitAll();
        http.formLogin();
       // http.authorizeRequests().antMatchers(HttpMethod.POST,"/users/**").hasAuthority("Admin");
       // http.authorizeRequests().antMatchers(HttpMethod.GET,"/users/**").hasAuthority("USER");
        http.authorizeHttpRequests().anyRequest().authenticated();
        http.addFilter(new JwtAuthenticationFilter(authenticationManagerBean()));
        http.addFilterBefore(new JwtAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
}
