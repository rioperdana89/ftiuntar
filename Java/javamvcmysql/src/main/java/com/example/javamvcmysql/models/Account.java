/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.javamvcmysql.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author novar
 */
@Entity
@Table(name="bankaccount")
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountID;
    private int accountNumber;
    private String accountName;
    private double accountBalance;
    
    public Account() {    
    }
    
    public Account(int AccountId, int AccountNumber, String AccountName, double AccountBalance) {
        this.accountID = AccountId;
        this.accountName = AccountName;
        this.accountNumber = AccountNumber;
        this.accountBalance = AccountBalance;
    }

    /**
     * @return the AccountID
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * @param AccountID the AccountID to set
     */
    public void setAccountID(int AccountID) {
        this.accountID = AccountID;
    }

    /**
     * @return the AccountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param AccountNumber the AccountNumber to set
     */
    public void setAccountNumber(int AccountNumber) {
        this.accountNumber = AccountNumber;
    }

    /**
     * @return the AccountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param AccountName the AccountName to set
     */
    public void setAccountName(String AccountName) {
        this.accountName = AccountName;
    }

    /**
     * @return the AccountBalance
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * @param AccountBalance the AccountBalance to set
     */
    public void setAccountBalance(double AccountBalance) {
        this.accountBalance = AccountBalance;
    }
    
    
}
