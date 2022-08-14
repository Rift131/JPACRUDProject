package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference;

@Service
@Transactional
public class EquipmentDAOImpl implements EquipmentDAO {
	// always keep the persistence at the class level for each class
	@PersistenceContext
	private EntityManager em;

	// ***********************************************
	// C: CREATE
	// ***********************************************

	@Override
	public EquipmentServiceReference create(EquipmentServiceReference esr) {
		em.getTransaction().begin();
		em.persist(esr);
		em.flush();
		em.getTransaction().commit();
		return esr;
	}

	// ***********************************************
	// R: RETRIEVE
	// ***********************************************

	@Override
	public EquipmentServiceReference findById(int id) {
//		EquipmentServiceReference 
//		String jpql = "SELECT esr FROM EquipmentServiceReference esr WHERE esr.id = :id ORDER BY esr.id";
		return em.find(EquipmentServiceReference.class, id);
	}

	@Override
	public List<EquipmentServiceReference> findAll() {
		List<EquipmentServiceReference> allEquipment = null;
		String jpql = "SELECT esr FROM EquipmentServiceReference esr WHERE id > 0 ORDER BY esr.id";
		allEquipment = em.createQuery(jpql, EquipmentServiceReference.class).getResultList();
		return allEquipment;
	}

	@Override
	public List<EquipmentServiceReference> findByKeyword(String input) {
		// List<EquipmentServiceReference> allMatches = null;
		String queryInput = input;
		//List<EquipmentServiceReference> query = ((List<EquipmentServiceReference>) em.createQuery;
		// String jpql = 
		TypedQuery<EquipmentServiceReference> createQuery = em.createQuery("SELECT esr  FROM EquipmentServiceReference esr WHERE esr.equipName LIKE :name OR esr.equipManf LIKE :manufacturer OR esr.equipMdl LIKE :model", EquipmentServiceReference.class);
		
		List<EquipmentServiceReference> equipmentMatches = createQuery
				.setParameter("name", queryInput)
				.setParameter("manufacturer", queryInput)
				.setParameter("model", queryInput)
				.getResultList();
				

		return equipmentMatches;
	}
	// ***********************************************
	// U: UPDATE
	// ***********************************************
	@Override
	public EquipmentServiceReference update(int id, EquipmentServiceReference esr) {
		
		EquipmentServiceReference managedEsr = em.find(EquipmentServiceReference.class, id);

		if (managedEsr != null) {
			// update the managed object 
			// pre-populate the form with the existing values to avoid verbose code checking each value for being null or not
			if (managedEsr.getEquipName()!= null) {
				managedEsr.setEquipName(esr.getEquipName());
				
				}
			if (managedEsr.getEquipManf()!= null) {
				managedEsr.setEquipManf(esr.getEquipManf());
				}
			
			if (managedEsr.getEquipMdl()!= null) {
				managedEsr.setEquipMdl(esr.getEquipMdl());
				}
			
			if (managedEsr.getEquipSerNum()!= null) {
				managedEsr.setEquipSerNum(esr.getEquipSerNum());
				}
			
			if (managedEsr.getEngManf()!= null) {
				managedEsr.setEngManf(esr.getEngManf());
				}
			
			if (managedEsr.getEngMdl()!= null) {
				managedEsr.setEngMdl(esr.getEngMdl());
				}
			
			if (managedEsr.getEngSerNum()!= null) {
				managedEsr.setEngSerNum(esr.getEngSerNum());
				}
			
			if (managedEsr.getEngOilManf()!= null) {
				managedEsr.setEngOilManf(esr.getEngOilManf());
				}
			
			if (managedEsr.getEngOilType()!= null) {
				managedEsr.setEngOilType(esr.getEngOilType());
				}
			
			if (managedEsr.getEngOilViscGrd()!= null) {
				managedEsr.setEngOilViscGrd(esr.getEngOilViscGrd());
				}
			
			if (managedEsr.getEngOilFltrManf()!= null) {
				managedEsr.setEngOilFltrManf(esr.getEngOilFltrManf());
				}
			
			if (managedEsr.getEngOilFltrPrtNum()!= null) {
				managedEsr.setEngOilFltrPrtNum(esr.getEngOilFltrPrtNum());
				}
			
			if (managedEsr.getEngAirFltrManf()!= null) {
				managedEsr.setEngAirFltrManf(esr.getEngAirFltrManf());
				}
			
			if (managedEsr.getEngAirFltrPrtNum()!= null) {
				managedEsr.setEngAirFltrPrtNum(esr.getEngAirFltrPrtNum());
				}
			
			if (managedEsr.getEngFuelSpec()!= null) {
				managedEsr.setEngFuelSpec(esr.getEngFuelSpec());
				}
			
			if (managedEsr.getEngFuelFltrManf()!= null) {
				managedEsr.setEngFuelFltrManf(esr.getEngFuelFltrManf());
				}
			
			if (managedEsr.getEngFuelFltrPrtNum()!= null) {
				managedEsr.setEngFuelFltrPrtNum(esr.getEngFuelFltrPrtNum());
				}
			
			if (managedEsr.getEngFuelOil()!= null) {
				managedEsr.setEngFuelOil(esr.getEngFuelOil());
				}
			
			if (managedEsr.getEngFuelOilManf()!= null) {
				managedEsr.setEngFuelOilManf(esr.getEngFuelOilManf());
				}
			
			if (managedEsr.getEngFuelOilName()!= null) {
				managedEsr.setEngFuelOilName(esr.getEngFuelOilName());
				}
			
			if (managedEsr.getEngFuelOilSerNum()!= null) {
			managedEsr.setEngFuelOilSerNum(esr.getEngFuelOilSerNum());
			}
			
			if (managedEsr.getEquipConsName()!= null) {
				managedEsr.setEquipConsName(esr.getEquipConsName());
				}
			
			if (managedEsr.getEquipConsManf()!= null) {
				managedEsr.setEquipConsManf(esr.getEquipConsManf());
				}
			
			if (managedEsr.getEquipConsPrtNum()!= null) {
				managedEsr.setEquipConsPrtNum(esr.getEquipConsPrtNum());
				}
			
			if (managedEsr.getEquipConsName2()!= null) {
				managedEsr.setEquipConsName2(esr.getEquipConsName2());
				}
			
			if (managedEsr.getEquipConsManf2()!= null) {
				managedEsr.setEquipConsManf2(esr.getEquipConsManf2());
				}
			
			if (managedEsr.getEquipConsPrtNum2()!= null) {
				managedEsr.setEquipConsPrtNum2(esr.getEquipConsPrtNum2());
				}
			
			if (managedEsr.getEquipConsName3()!= null) {
				managedEsr.setEquipConsName3(esr.getEquipConsName3());
				}
			
			if (managedEsr.getEquipConsManf3()!= null) {
				managedEsr.setEquipConsManf3(esr.getEquipConsManf3());
				}
			
			if (managedEsr.getEquipConsPrtNum3()!= null) {
				managedEsr.setEquipConsPrtNum3(esr.getEquipConsPrtNum3());
				}
			// PROBLEM: APPEND INSTEAD OF RESETTING. Problem can be fixed with pre-populating the entries in the JSP.
			if (managedEsr.getEquipNotes()!= null) {
				managedEsr.setEquipNotes(esr.getEquipNotes());
				}
		}
	// tranactions (begin and commit) and emfs already exist
		em.persist(managedEsr);
		return managedEsr;
	}
	// ***********************************************
	// D: DESTROY
	// ***********************************************

	@Override
	public boolean destroy(int id) {
		boolean equipmentRemoved = false;
		EquipmentServiceReference equipmentDelete = em.find(EquipmentServiceReference.class, id);
		
		if (equipmentDelete != null) {
			em.remove(equipmentDelete);
			equipmentRemoved = !em.contains(equipmentDelete);
		}
		return equipmentRemoved;
	}


}