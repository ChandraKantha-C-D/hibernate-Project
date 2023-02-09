package com.ty.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.ty.Dto.Address;
import com.ty.Dto.Branch;
import com.ty.Dto.Hospital;
import com.ty.Dto.Person;

public class AddressDao {

	
	Med_Items_Dao med_Items_Dao = new Med_Items_Dao();

	public void saveAddress(int b_id , Address address) {

		EntityManager entityManager = med_Items_Dao.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
        Branch branch  =entityManager.find(Branch.class, b_id);
        
        address.setBranch(branch);
		entityTransaction.begin();

		entityManager.persist(address);

		entityTransaction.commit();

	}

	public void updateAddress(int a_id, String a_address) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
	    Address address = eManager.find(Address.class, a_id);
		if (address != null) {
			address.setAddress(a_address);
			eTransaction.begin();
			eManager.merge(address);
			eTransaction.commit();
		} else {
			System.out.println("Id is not found");
		}

	}

	public void deleteAddress(int a_id) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		 Address address = eManager.find(Address.class, a_id);
			if (address != null) {
			eTransaction.begin();
			eManager.remove(address);
			eTransaction.commit();
		} else {
			System.out.println("Id is not found");
		}
	}

	public void getAddressById(int a_id) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		 Address address = eManager.find(Address.class, a_id);
			if (address != null) {
			System.out.println(address);
		} else {
			System.out.println("Id is not found");
		}

	}

	public List<Address> getAllAddress() {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		Query query = eManager.createQuery("select h from Address h");
		List<Address> list1 = query.getResultList();
		return list1;

	}

}
