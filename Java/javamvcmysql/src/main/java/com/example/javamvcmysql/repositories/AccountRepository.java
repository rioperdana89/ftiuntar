/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.javamvcmysql.repositories;

import com.example.javamvcmysql.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author novar
 */
public interface AccountRepository extends JpaRepository <Account, Integer>{
    Account findByAccountNumber(final int AccountNumber);
}
