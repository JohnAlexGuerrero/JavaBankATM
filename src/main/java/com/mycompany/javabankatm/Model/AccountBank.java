/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabankatm.Model;


/**
 *
 * @author JOHN
 */
public class AccountBank{
    private String accountNumber = "123456";
    private double balance = 0.0;
    private User user;

    public AccountBank(String accountNumber, double initialBalance, User user) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.user = user;
    }
    
    public void deposit(double amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount)throws InsufficientFundsException {
        if(amount > this.balance){
            throw new InsufficientFundsException();
        }
        this.balance -= amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}
