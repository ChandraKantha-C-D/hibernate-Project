package com.ty.Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Med_Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int med_orders_id;
	private String doctor;
	@ManyToOne
	private Encounter encounter;
	public int getMed_orders_id() {
		return med_orders_id;
	}
	public void setMed_orders_id(int med_orders_id) {
		this.med_orders_id = med_orders_id;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	@Override
	public String toString() {
		return "Med_Orders [med_orders_id=" + med_orders_id + ", doctor=" + doctor + ", encounter=" + encounter + "]";
	}
	
	
	
	
	

}
