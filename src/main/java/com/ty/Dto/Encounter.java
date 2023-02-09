package com.ty.Dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int encounter_id;
	private String reason;
	@ManyToOne
	private Person person;
	@OneToMany
	private List<Branch> branchlist;
	public int getEncounter_id() {
		return encounter_id;
	}
	public void setEncounter_id(int encounter_id) {
		this.encounter_id = encounter_id;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Branch> getBranchlist() {
		return branchlist;
	}
	public void setBranchlist(List<Branch> branchlist) {
		this.branchlist = branchlist;
	}
	@Override
	public String toString() {
		return "Encounter [encounter_id=" + encounter_id + ", reason=" + reason + ", person=" + person + ", branchlist="
				+ branchlist + "]";
	}
	
	

	
	
	
	
	
	}
	
	


