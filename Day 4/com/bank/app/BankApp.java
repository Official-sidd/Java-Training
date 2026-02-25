package com.bank.app;

import java.util.Scanner;
import com.bank.model.Account;
import com.bank.exception.*;

public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account = new Account("Siddharth", 1000);

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InvalidAmountException | InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed.");
        }

        account.displayBalance();
        sc.close();
    }
}