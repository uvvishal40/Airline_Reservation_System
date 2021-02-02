package com.hibernate.practice.daos;

import com.hibernate.practice.entities.Account;
import com.hibernate.practice.entities.Flights;

import java.util.List;

public interface IFlightsDAO {
    List<Flights> all();
    List<Flights> booked();
}
