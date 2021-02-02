package com.hibernate.practice.services;

import com.hibernate.practice.daos.IFlightsDAO;
import com.hibernate.practice.entities.Flights;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightsService implements IFlightsService {
    @Autowired
    IFlightsDAO dao;
	@Override
    public List<Flights> all() {
        return dao.all();
    }

    @Override
    public List<Flights> booked() {
        return null;
    }
}
