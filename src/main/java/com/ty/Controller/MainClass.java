package com.ty.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.Dao.EncounterDao;
import com.ty.Dto.Address;
import com.ty.Dto.Branch;
import com.ty.Dto.Encounter;
import com.ty.Dto.Hospital;
import com.ty.Dto.Med_Items;
import com.ty.Dto.Med_Orders;
import com.ty.Dto.Person;

public class MainClass {

	public static void main(String[] args) {
//		Hospital hospital = new Hospital();
//		hospital.setHospital_id(1);
//		hospital.setHospital_name("Narayana");
//		hospital.setGst("ABC123");
//		
//		Branch branch1 = new Branch();
//		branch1.setBranch_id(101);
//		branch1.setBranch_name("Narayana Marthahalli ");
//		branch1.setPhoneno(95867);
//		
//		Branch branch2 = new Branch();
//		branch2.setBranch_id(102);
//		branch2.setBranch_name("Narayana Rajajinagar ");
//		branch2.setPhoneno(95852);
//		
//		Branch branch3 = new Branch();
//		branch3.setBranch_id(103);
//		branch3.setBranch_name("Narayana Karthigupe ");
//		branch3.setPhoneno(95654);
//		
//		Branch branch4 = new Branch();
//		branch4.setBranch_id(104);
//		branch4.setBranch_name("Narayana Chikamaglur ");
//		branch4.setPhoneno(95258);
//		
//		Address address1 = new Address();
//		address1.setAddress_id(11);
//		address1.setAddress("Marthahalli");
//		
//		Address address2 = new Address();
//		address2.setAddress_id(12);
//		address2.setAddress("Rajajinagar");
//		
//		Address address3 = new Address();
//		address3.setAddress_id(13);
//		address3.setAddress("Karthigupe");
//		
//		Address address4 = new Address();
//		address4.setAddress_id(14);
//		address4.setAddress("Chikamaglur");
//		
//		branch1.setAddress(address1);
//		branch2.setAddress(address2);
//		branch3.setAddress(address3);
//		branch4.setAddress(address4);
//		
//		List< Branch> branchesList = new ArrayList<Branch>();
//		branchesList.add(branch1);
//		branchesList.add(branch2);
//		branchesList.add(branch3);
//		branchesList.add(branch4);
//		
//		hospital.setBranch(branchesList);
//		
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		
//		entityTransaction.begin();
//		
//		entityManager.persist(hospital);
//		
//		entityManager.persist(branch1);
//		entityManager.persist(branch2);
//		entityManager.persist(branch3);
//		entityManager.persist(branch4);
//		
//		entityManager.persist(address1);
//		entityManager.persist(address2);
//		entityManager.persist(address3);
//		entityManager.persist(address4);
//		
//		entityTransaction.commit();
		/****************************************/
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction entityTransaction = entityManager.getTransaction();
//		Person person = new Person();
//		person.setPerson_id(1001);
//		person.setPerson_name("Nayana");
//		person.setPerson_contact_number(9874563210l);
//		person.setPerson_address("Bng");
//		
//		Encounter encounter1 = new Encounter();
//		encounter1.setEncounter_id(201);
//		encounter1.setReason("Heart Problem");
//		
//		Branch branch = entityManager.find(Branch.class, 101);
//		encounter1.setBranche(branch);
//		
//		List< Encounter> encounterList = new ArrayList<Encounter>();
//		encounterList.add(encounter1);
//		
//		person.setEncounter(encounterList);
//		
//		
//		Med_Orders med_Orders1 = new  Med_Orders();
//		med_Orders1.setMed_orders_id(301);
//		med_Orders1.setDoctor("Shivaraj");
//		
//		List< Med_Orders > med_OrdersList = new ArrayList<Med_Orders>();
//		med_OrdersList.add(med_Orders1);
//		
//		Med_Items med_Items1=new Med_Items();
//		med_Items1.setMed_item_id(401);
//		med_Items1.setMed_item_name("ABC");
//		med_Items1.setMed_item_price(95.01);
//		
//		Med_Items med_Items2=new Med_Items();
//		med_Items2.setMed_item_id(402);
//		med_Items2.setMed_item_name("CDE");
//		med_Items2.setMed_item_price(55.85);
//		
//		Med_Items med_Items3=new Med_Items();
//		med_Items3.setMed_item_id(403);
//		med_Items3.setMed_item_name("VFR");
//		med_Items3.setMed_item_price(5.50);
//		
//		List< Med_Items > med_ItemsList = new ArrayList<Med_Items>();
//		med_ItemsList.add(med_Items1);
//		med_ItemsList.add(med_Items2);
//		med_ItemsList.add(med_Items3);
//		
//		
//		
//		med_Orders1.setMed_items(med_ItemsList);
//		
//		encounter1.setMed_orders(med_OrdersList);
//		
//		
//		
//		
//		
//		entityTransaction.begin();
//		
//		entityManager.persist(person);
//		
//      entityTransaction.commit();
		
//		Branch branch2 = new Branch();
//		branch2.setBranch_id(102);
//		branch2.setBranch_name("Narayana Rajajinagar ");
//		branch2.setPhoneno(95852);
//		
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinod");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction eT = entityManager.getTransaction();
		
		//System.out.println(entityManager.find(Person.class,1001)); 
//		
//		Branch branch = entityManager.find(Branch.class, 101);
//		encounter1.setBranche(
	
//		Encounter encounter	=entityManager.find(Encounter.class,201);
//		encounter.setBranche(branch2);
//		List< Encounter> list = new ArrayList<Encounter>();
//		list.add(encounter);
//		Person person = entityManager.find(Person.class, 1001);
//		 
//        person.setEncounter(list);
//	    eT.begin();
//	    entityManager.merge(person);
//	    eT.commit();
		
       // System.out.println(entityManager.find(Person.class, 1001));
		
//		
//		Branch branch4 = new Branch();
//		branch4.setBranch_id(104);
//		branch4.setBranch_name("Narayana Chikamaglur ");
//		branch4.setPhoneno(95258);
//		
//		Encounter encounter = new Encounter();
//		encounter.setEncounter_id(202);
//		encounter.setReason("Head pain");
//		encounter.setBranche(branch4);
//		encounter.setMed_orders(null);
//		
//		List<Encounter> encounterList = new ArrayList<Encounter>();
//		encounterList.add(encounter);
//		
//	EncounterDao dao = new EncounterDao();
//	dao.saveEncounter(1001 , encounterList);
//	System.out.println("Inserted");
//		
		
		
		
		
		
		
		
		

	}

}
