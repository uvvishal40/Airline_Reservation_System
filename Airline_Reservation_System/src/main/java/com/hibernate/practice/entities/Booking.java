package com.hibernate.practice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	@Id
	@Column(nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "userid")
	private Account acc;

	// private String username;

	@OneToOne
	@JoinColumn(name = "fltid")
	private Flights flt;

	// private Integer flight;

	public Booking() {

	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public Flights getFlt() {
		return flt;
	}

	public void setFlt(Flights flt) {
		this.flt = flt;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", acc=" + acc + ", flt=" + flt + "]";
	}

}
