/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabankatm.Model;

/**
 *
 * @author JOHN
 */
public class SavingAccount extends AccountBank{
    private double interstRate;
    
    public SavingAccount(String accountNumber, double initialBalance, User user, double interesRate) {
        super(accountNumber, initialBalance, user);
        this.interstRate = interesRate;
    }
    
    public void applyInterest(){
        double interest = getBalance() * interstRate;
        deposit(interest);
    }
    
}
