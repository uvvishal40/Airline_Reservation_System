package com.hibernate.practice.services;

import com.hibernate.practice.entities.Flights;

import java.util.List;

public interface IFlightsService {
    List<Flights> all();
    List<Flights> booked();
}
