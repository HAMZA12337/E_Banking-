package com.zarguan.ebanking;

import com.zarguan.ebanking.DTOs.CustomerDTO;
import com.zarguan.ebanking.services.*;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class DigitalBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(DigitalBankApplication.class, args);
    }

   //@Bean
    CommandLineRunner commandLineRunner(BankAccountService bankAccountService, CostumerService costumerService, OperationService operationService) {
        return args -> {
            Faker  faker = new Faker();

            for (int i = 0; i < 10; i++) {
                CustomerDTO customer = new CustomerDTO();
                customer.setFirstName(faker.name().firstName());
                customer.setLastName(faker.name().lastName());
                customer.setEmail(faker.internet().emailAddress());
                costumerService.saveCustomer(customer);
            }

          // create bank accounts
          costumerService.listCustomers().forEach(customer -> {
              bankAccountService.saveCurrentBankAccount(Math.random() * 9000 +1000, customer.getId(), 9000);
              bankAccountService.saveSavingBankAccount(Math.random() * 120000 +1000, customer.getId(), 4.3);
          });


          bankAccountService.listBankAccounts().forEach(bankAccount -> {
              for(int i=0; i<10; i++) {
                  operationService.credit(bankAccount.getId(), 1000 + Math.random() * 12000, "Credit");
                  operationService.debit(bankAccount.getId(), 1000 + Math.random() * 5000, "Debit");
              }
          });


        };
    }

}
