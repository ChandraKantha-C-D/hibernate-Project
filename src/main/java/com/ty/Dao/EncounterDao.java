package com.ty.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Dto.Branch;
import com.ty.Dto.Encounter;
import com.ty.Dto.Person;

public class EncounterDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory eMFEntityManagerFactory = Persistence.createEntityManagerFactory("vinod");
		return eMFEntityManagerFactory.createEntityManager();

	}

	public void saveEncounter(int person_id, int branch_id, Encounter encounter) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Branch getBranch = eManager.find(Branch.class, branch_id);
		Person getPerson = eManager.find(Person.class, person_id);
		encounter.setPerson(getPerson);
		List<Branch> list = new ArrayList<Branch>();
		list.add(getBranch);
		encounter.setBranchlist(list);

		if (getBranch != null && getPerson != null) {
			eTransaction.begin();

			eManager.persist(encounter);
			eTransaction.commit();
		} else
			System.out.println("id not found");
		}
	
	public void updateEncounter(int encounter_id, String reason) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Encounter encounter = eManager.find(Encounter.class, encounter_id);
		encounter.setReason(reason);
		eTransaction.begin();
		eManager.merge(encounter);
		eTransaction.commit();
		}


//	public void updateEncounter(int encounter_id, int branch_id, String reason) {
//		EntityManager eManager = getEntityManager();
//		EntityTransaction eTransaction = eManager.getTransaction();
//		Encounter getEncouter = eManager.find(Encounter.class, encounter_id);
//		
//		List<Branch> branchsList = getEncouter.getBranchlist();
//		Branch existingBranch = eManager.find(Branch.class, branch_id);
//		branchsList.add(existingBranch);
//		if (getEncouter != null) {
//		getEncouter.setBranchlist(branchsList);
//		getEncouter.setReason(reason);
//			eTransaction.begin();
//			eManager.merge(getEncouter);
//			eTransaction.commit();
//		} else
//			System.out.println("id not found");
//	}

	public void deleteEncounter(int encounter_id) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Encounter getEncouter = eManager.find(Encounter.class, encounter_id);
		if (getEncouter != null) {
			eTransaction.begin();
			eManager.remove(getEncouter);
			eTransaction.commit();
		} else
			System.out.println("id not found");
	}

	public void getEncounterById(int encounter_id) {
		EntityManager eManager = getEntityManager();
		Encounter getEncouter = eManager.find(Encounter.class, encounter_id);
		if (getEncouter != null) {
			System.out.println(getEncouter);
		} else
			System.out.println("id not found");
	}

	public List<Encounter> getAllEncounters() {
		EntityManager eManager = getEntityManager();
		Query query = eManager.createQuery("select e from Encounter e");
		List<Encounter> list = query.getResultList();
		return list;
	}

}
