package com.ty.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.ty.Dto.Hospital;
import com.ty.Dto.Person;

public class HospitalDao {

	Med_Items_Dao med_Items_Dao = new Med_Items_Dao();

	public void saveHospital(Hospital hospital) {

		EntityManager entityManager = med_Items_Dao.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		entityManager.persist(hospital);

		entityTransaction.commit();

	}

	public void updateHospital(int id, String name) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Hospital hospital= eManager.find(Hospital.class, id);
		if (hospital != null) {
			hospital.setHospital_name(name);
			eTransaction.begin();
			eManager.merge(hospital);
			eTransaction.commit();
		} else {
			System.out.println("Id is not found");
		}

	}

	public void deleteHospital(int id) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Hospital hospital= eManager.find(Hospital.class, id);
		if (hospital != null) {
			eTransaction.begin();
			eManager.remove(hospital);
			eTransaction.commit();
		} else {
			System.out.println("Id is not found");
		}
	}

	public void getHospitalById(int id) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		Hospital hospital= eManager.find(Hospital.class, id);
		if (hospital != null) {
			System.out.println(hospital);
		} else {
			System.out.println("Id is not found");
		}

	}

	public List<Hospital> getAllHospital() {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		Query query = eManager.createQuery("select h from Hospital h");
		List<Hospital> list1 = query.getResultList();
		return list1;

	}

}
