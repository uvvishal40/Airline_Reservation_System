package com.hibernate.practice.daos;

import com.hibernate.practice.entities.Account;

public interface IAccountDAO {
    boolean register(Account account);
    Account login(Account account);
    boolean forgotPassword(Account account);
}
