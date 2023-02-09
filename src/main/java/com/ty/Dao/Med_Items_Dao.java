package com.ty.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Dto.Med_Items;
import com.ty.Dto.Med_Orders;

public class Med_Items_Dao {
	
	
		public EntityManager getEntityManager() {
		EntityManagerFactory eMFEntityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return eMFEntityManagerFactory.createEntityManager();

		}

		public void saveMedItems(Med_Items items, int  med_orders_id) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Med_Orders getMedOrders = eManager.find(Med_Orders.class, med_orders_id);
		 items.setMed_Orders(getMedOrders);
		eTransaction.begin();

		eManager.persist(items);


		eTransaction.commit();
		}

		public void updateMedItems(int  med_item_id, String med_item_name) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Med_Items getMedItems = eManager.find(Med_Items.class, med_item_id);
		if (getMedItems != null) {
		getMedItems.setMed_item_name(med_item_name);
		eTransaction.begin();

		eManager.merge(getMedItems);

		eTransaction.commit();

		}
		else
		System.out.println("id not found");



		}

		public void deleteMedItems(int med_item_id ) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Med_Items getMedItems = eManager.find(Med_Items.class, med_item_id);
		if (getMedItems != null) {

		eTransaction.begin();

		eManager.remove(getMedItems);

		eTransaction.commit();

		}
		else
		System.out.println("id not found");

		}

		public void getMedItemsById(int med_item_id ) {
		EntityManager eManager = getEntityManager();
		Med_Items getMedItems = eManager.find(Med_Items.class, med_item_id);
		System.out.println(getMedItems);

		}
		public List<Med_Items> getALlMedItems(){
		EntityManager eManager = getEntityManager();
		Query query=eManager.createQuery("select m from Med_Items m");
		List<Med_Items> list=query.getResultList();
		return list;
		}

		}

	
    

