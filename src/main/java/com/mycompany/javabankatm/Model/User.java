/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabankatm.Model;

import com.mycompany.javabankatm.Controller.AuthenticatableIF;

/**
 *
 * @author JOHN
 */
public class User implements AuthenticatableIF{
    private String names = "";
    private int age = 0;
    private String pin = "0000";

    public User() {
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean autheticate(String pin) {
        return true;
    }
    
    
}
