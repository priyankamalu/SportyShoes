package com.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@GeneratedValue
	@Column(name="id")
    private int id;
	@Column(name="aname",length=10,unique=true)
    private String aname;
	@Column(name="apassword",length=10,unique=true)
    private String apassword;
	
	public Admin()
	{
		super();
	}
	public Admin(int id, String aname, String apassword) {
		super();
		this.id = id;
		this.aname = aname;
		this.apassword = apassword;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	
	
}
