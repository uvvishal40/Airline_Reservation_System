package com.hibernate.practice.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hibernate.practice.entities.Flights;
import com.hibernate.practice.services.FlightsService;

@Controller
@RequestMapping("/flights")
public class FlightsController {
    @Autowired
    private FlightsService service;

   
    @GetMapping("/all")
    public ModelAndView showAllPage() {
        ModelAndView mv=new ModelAndView("/flights/all");
        System.out.println("In FLightsController");
    	//hs.setAttribute("all", service.all());
    	List<Flights> flights = service.all();
    	mv.addObject("flightList",flights);
        System.out.println("Return from flight service");
        return mv;
    }

    @GetMapping("/booked")
    public String showBookedPage(HttpSession hs) {
        hs.setAttribute("booked", service.booked());

        return "/flights/booked";
    }
}
