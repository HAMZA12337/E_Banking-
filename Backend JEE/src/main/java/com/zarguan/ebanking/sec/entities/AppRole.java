package com.zarguan.ebanking.sec.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
public class AppRole {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private  Long id ;
    private  String rolename;

}
