package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.List;

import javax.persistence.*;//Table;

@Entity
@Table(name="Customer")
public class Customer {

	   @Id
	   @GeneratedValue
	   @Column(name="Cust_ID")
	   private int cid;
	   @Column(name="Cust_name")
	   private String cname;
	   @Column(name="Date")
	   private String date;
	   @Column(name="Product_Catagory")
	   private String pcatagary;
	   @Column(name="Pname")
	   private String pname;
	   
	//  @ManyToMany(mappedBy="Customer", cascade=CascadeType.ALL)
	 // @JoinColumn(name="pid")
	 //private List<Product> product;
	   
	   public Customer()
	   {
		   super();
	   }
	public Customer(int cid, String cname, String date, String pcatagary) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.date = date;
		this.pcatagary = pcatagary;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;	
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPcatagary() {
		return pcatagary;
	}
	public void setPcatagary(String pcatagary) {
		this.pcatagary = pcatagary;
	}
	   
	   
	   
}
