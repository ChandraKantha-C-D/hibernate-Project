package com.ty.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.ty.Dto.Branch;
import com.ty.Dto.Encounter;
import com.ty.Dto.Hospital;
import com.ty.Dto.Person;

public class BranchDao {
	Med_Items_Dao med_Items_Dao = new Med_Items_Dao();

	public void saveBranch(int h_id, Branch branch) {

		EntityManager entityManager = med_Items_Dao.getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Hospital getHospital = entityManager.find(Hospital.class, h_id);

		if (getHospital != null) {
			branch.setHospital(getHospital);
			entityTransaction.begin();

			entityManager.persist(branch);

			entityTransaction.commit();
		} else {
			System.out.println("Hospital not found");
		}

	}

	public void updateBranch(int b_id, String b_name) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Branch branch = eManager.find(Branch.class, b_id);
		if (branch != null) {
			branch.setBranch_name(b_name);
			;
			eTransaction.begin();
			eManager.merge(branch);
			eTransaction.commit();
		} else {
			System.out.println("Id is not found");
		}

	}

	public void deleteBranch(int b_id) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Branch branch = eManager.find(Branch.class, b_id);
		if (branch != null) {
			eTransaction.begin();
			eManager.remove(branch);
			eTransaction.commit();
		} else {
			System.out.println("Id is not found");
		}
	}

	public void getBranchById(int b_id) {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		Branch branch = eManager.find(Branch.class, b_id);
		if (branch != null) {
			System.out.println(branch);
		} else {
			System.out.println("Id is not found");
		}

	}

	public List<Branch> getAllBranches() {
		EntityManager eManager = med_Items_Dao.getEntityManager();
		Query query = eManager.createQuery("select h from Branch h");
		List<Branch> list1 = query.getResultList();
		return list1;

	}

}
