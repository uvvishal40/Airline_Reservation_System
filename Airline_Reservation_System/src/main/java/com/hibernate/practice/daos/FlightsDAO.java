package com.hibernate.practice.daos;

import com.hibernate.practice.entities.Account;
import com.hibernate.practice.entities.Flights;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightsDAO implements IFlightsDAO {
    @Autowired
    private SessionFactory factory;

    public void setSessionFactory(SessionFactory sf) {
        this.factory = sf;
    }

    @Override
    public List<Flights> all() {
       Session session = null;
        List <Flights> flights = null;

        try {
            session = factory.openSession();
            session.beginTransaction();
            flights = session.createQuery("FROM Flights").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(flights);
        return (List<Flights>) flights;
    }

    @Override
    public List<Flights> booked() {
        return null;
    }
}
