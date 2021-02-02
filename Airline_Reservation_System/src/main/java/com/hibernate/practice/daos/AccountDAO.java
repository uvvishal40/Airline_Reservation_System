package com.hibernate.practice.daos;

import com.hibernate.practice.entities.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class AccountDAO implements IAccountDAO {
    @Autowired
    private SessionFactory factory;

    public void setSessionFactory(SessionFactory sf) {
        this.factory = sf;
    }

    @Override
    public boolean register(Account account) {
        Session session = null;
        boolean status = false;

        try {
            session = factory.openSession();
            session.beginTransaction();
            session.save(account);
            session.getTransaction().commit();

            status = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    @Override
    public Account login(Account account) {
        Session session = null;
        Account user = null;

        try {
            session = factory.openSession();
            session.beginTransaction();
            user = (Account) session.load(Account.class, 1);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public boolean forgotPassword(Account account) {
        Session session = null;
        boolean status = false;
        Account user = null;

        try {
            session = factory.openSession();
            session.beginTransaction();
            user = (Account) session.load(Account.class, 1);

            if (user.getUsername().equals(account.getUsername())) {
                session.update(new Account(account.getUsername(), account.getPassword()));
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}
