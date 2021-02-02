package com.hibernate.practice.services;

import com.hibernate.practice.daos.IAccountDAO;
import com.hibernate.practice.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private IAccountDAO dao;

    @Override
    public boolean register(Account account) {
        return this.dao.register(account);
    }

    @Override
    public Account login(Account account) {
        return this.dao.login(account);
    }

    @Override
    public boolean forgotPassword(Account account) {
        return this.dao.forgotPassword(account);
    }
}
