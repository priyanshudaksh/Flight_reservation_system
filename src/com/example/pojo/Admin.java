package com.example.pojo;

public class Admin {
	private int aid;
	private String aname;
	private String aemail;
	private String apassword;
	private String asrc;
	
	
	public Admin(int aid, String aname, String aemail, String apassword, String asrc) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.aemail = aemail;
		this.apassword = apassword;
		this.asrc = asrc;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	public String getAsrc() {
		return asrc;
	}
	public void setAsrc(String asrc) {
		this.asrc = asrc;
	}
	
	
}
