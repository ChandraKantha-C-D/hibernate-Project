package com.ty.Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Med_Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int med_item_id;
	private String med_item_name;
	private double med_item_price;
	
	@ManyToOne
	private Med_Orders med_Orders;

	public int getMed_item_id() {
		return med_item_id;
	}

	public void setMed_item_id(int med_item_id) {
		this.med_item_id = med_item_id;
	}

	public String getMed_item_name() {
		return med_item_name;
	}

	public void setMed_item_name(String med_item_name) {
		this.med_item_name = med_item_name;
	}

	public double getMed_item_price() {
		return med_item_price;
	}

	public void setMed_item_price(double med_item_price) {
		this.med_item_price = med_item_price;
	}

	public Med_Orders getMed_Orders() {
		return med_Orders;
	}

	public void setMed_Orders(Med_Orders med_Orders) {
		this.med_Orders = med_Orders;
	}

	@Override
	public String toString() {
		return "Med_Items [med_item_id=" + med_item_id + ", med_item_name=" + med_item_name + ", med_item_price="
				+ med_item_price + ", med_Orders=" + med_Orders + "]";
	}
	
	

}
