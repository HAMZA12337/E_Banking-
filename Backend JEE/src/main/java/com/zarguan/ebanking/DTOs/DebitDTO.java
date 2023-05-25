package com.zarguan.ebanking.DTOs;
import lombok.Data;
@Data
public class DebitDTO {
    private String accountId;
    private double amount;
    private String description;
}