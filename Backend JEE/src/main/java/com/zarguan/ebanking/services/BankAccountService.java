package com.zarguan.ebanking.services;
import com.zarguan.ebanking.DTOs.BankAccountDTO;
import com.zarguan.ebanking.entities.BankAccount;
import com.zarguan.ebanking.exceptions.BankAccountNotFoundException;
import java.util.List;

public interface BankAccountService {

    /*Bank Account  methods */
    BankAccount saveCurrentBankAccount(double initialBalance, Long customerId, double overDraft);
    BankAccount saveSavingBankAccount(double initialBalance, Long customerId, double interestRate);
    List<BankAccountDTO> listBankAccounts();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;

}
