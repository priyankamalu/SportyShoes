package com.project.entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Product")
public class Product {
   @Id
   @GeneratedValue
   @Column(name="Product_id")
	private int pid;
   @Column(name="Product_name")
	private String pname;
   @Column(name="Product_catagory")
	private String pcatagary;
   @Column(name="Price")
	private long price;
   
  // @ManyToMany(mappedBy="Product", cascade=CascadeType.ALL)
    //private List<Customer> customer;
  
   
   public Product()
   {
	   super();
   }
public Product(int pid, String pname, String pcatagary, long price) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pcatagary = pcatagary;
	this.price = price;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPcatagary() {
	return pcatagary;
}
public void setPcatagary(String pcatagary) {
	this.pcatagary = pcatagary;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
   
   
	
}
