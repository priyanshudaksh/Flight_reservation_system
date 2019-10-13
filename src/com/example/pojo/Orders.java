package com.example.pojo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Orders {
	//PNR		userid		Username	flightID	FlightName	SRC		Des		SEAT	DOJ		TOJ			Amount	Booking time
	private int pnr;
	private int userid;
	private String username;
	private int flightid;
	private String flightname;
	private String source;
	private String destination;
	private int seats;
	private LocalDate doj;
	private LocalTime toj;
	private double amount;
	private LocalDate booktime;
	private String Cateogory;
	private int passangers;
	public Orders(int pnr, int userid, String username, int flightid, String flightname, String source,
			String destination, int seats, LocalDate doj, LocalTime toj, double amount, LocalDate booktime,
			String cateogory, int passangers) {
		super();
		this.pnr = pnr;
		this.userid = userid;
		this.username = username;
		this.flightid = flightid;
		this.flightname = flightname;
		this.source = source;
		this.destination = destination;
		this.seats = seats;
		this.doj = doj;
		this.toj = toj;
		this.amount = amount;
		this.booktime = booktime;
		Cateogory = cateogory;
		this.passangers = passangers;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalTime getToj() {
		return toj;
	}
	public void setToj(LocalTime toj) {
		this.toj = toj;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getBooktime() {
		return booktime;
	}
	public void setBooktime(LocalDate booktime) {
		this.booktime = booktime;
	}
	public String getCateogory() {
		return Cateogory;
	}
	public void setCateogory(String cateogory) {
		Cateogory = cateogory;
	}
	public int getPassangers() {
		return passangers;
	}
	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}
	
	
}
