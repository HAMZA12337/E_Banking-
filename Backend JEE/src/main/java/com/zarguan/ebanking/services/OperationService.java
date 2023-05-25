package com.zarguan.ebanking.services;


import com.zarguan.ebanking.DTOs.AccountHistoryDTO;
import com.zarguan.ebanking.DTOs.AccountOperationDTO;
import com.zarguan.ebanking.exceptions.BalanceNotSufficientException;
import com.zarguan.ebanking.exceptions.BankAccountNotFoundException;

import java.util.List;

public interface OperationService {

    List<AccountOperationDTO> historique(String accountId);

    AccountHistoryDTO HistoriquePages(String accountId, int page, int size) throws BankAccountNotFoundException;


    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;

    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;

    void transfer(String accountIdSource, String accountIdDest, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

}
