package com.hibernate.practice.entities;


import javax.persistence.*;

@Entity
@Table(name = "flights")
public class Flights {
    @Id
    @Column(nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @OneToOne(mappedBy = "flt")
    private Booking bk; 

    private String sourcePlace;

    private String destinationPlace;

    public Flights(String sourcePlace, String destinationPlace) {
        this.sourcePlace = sourcePlace;
        this.destinationPlace = destinationPlace;
    }

    public Flights() {

    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSourcePlace() {
        return this.sourcePlace;
    }

    public void setSourcePlace(String sourcePlace) {
        this.sourcePlace = sourcePlace;
    }

    public String getDestinationPlace() {
        return this.destinationPlace;
    }

    public void setDestinationPlace(String destinationPlace) {
        this.destinationPlace = destinationPlace;
    }

    @Override
    public String toString() {
        return "Flights{" +
            "id=" + id +
            ", sourcePlace='" + sourcePlace + '\'' +
            ", destinationPlace='" + destinationPlace + '\'' +
            '}';
    }
}
