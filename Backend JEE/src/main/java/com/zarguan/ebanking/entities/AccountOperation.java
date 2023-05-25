package com.zarguan.ebanking.entities;

import com.zarguan.ebanking.enums.OperationType;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class AccountOperation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private OperationType type;
    private double amount;
    private String description;
    private Date date;

    @ManyToOne
    private BankAccount bankAccount;
}
