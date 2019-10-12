package com.example.pojo;
//flight_id flight_name source destination date time fare Class

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
	private int fid;
	private String fname;
	private String source;
	private String destination;
	private LocalDate doj;
	private LocalTime time;
	private double fare;
	private String cateogory;
	
	
	
	public Flight(int fid, String fname, String source, String destination, LocalDate doj, LocalTime time, double fare,
			String cateogory) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.source = source;
		this.destination = destination;
		this.doj = doj;
		this.time = time;
		this.fare = fare;
		this.cateogory = cateogory;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
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
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getCateogory() {
		return cateogory;
	}
	public void setCateogory(String cateogory) {
		this.cateogory = cateogory;
	}
		
}
