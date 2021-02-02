package com.hibernate.practice.services;

import com.hibernate.practice.entities.Account;

public interface IAccountService {
    boolean register(Account account);
    Account login(Account account);
    boolean forgotPassword(Account account);
}
