package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference;

@Transactional
@Service
public class EquipmentDAOImpl implements EquipmentDAO {
	// always keep the @Persistence at the class level for each class
	@PersistenceContext
	public EntityManager em;

	// ***********************************************
	// C: CREATE
	// ***********************************************

	@Override
	public EquipmentServiceReference create(EquipmentServiceReference esr) {
		em.persist(esr);
		em.flush();
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
	public List<EquipmentServiceReference> findAllEquipment() {
		List<EquipmentServiceReference> allEquipment = null;
		String jpql = "SELECT esr FROM EquipmentServiceReference esr WHERE esr.id > 0 ORDER BY esr.equipName";
		// "
		allEquipment = em.createQuery(jpql, EquipmentServiceReference.class).getResultList();
		return allEquipment;
	}

	@Override
	public List<EquipmentServiceReference> findByKeyword(String input) {
		List<EquipmentServiceReference> allMatches = null;
		System.out.println("Supplied String to findByKeyword: " + input);
		//List<EquipmentServiceReference> query = ((List<EquipmentServiceReference>) em.createQuery;
		String jpql = "SELECT esr  FROM EquipmentServiceReference esr WHERE esr.equipName LIKE :bindVar OR esr.equipManf LIKE :bindVar OR esr.equipMdl LIKE :bindVar";
		allMatches = em.createQuery(jpql, EquipmentServiceReference.class)
				.setParameter("bindVar", input)
				.getResultList();
		// TypedQuery<EquipmentServiceReference> createQuery = em.createQuery("SELECT esr  FROM EquipmentServiceReference esr WHERE esr.equipName LIKE :name OR esr.equipManf LIKE :manufacturer OR esr.equipMdl LIKE :model", EquipmentServiceReference.class);
		
		// List<EquipmentServiceReference> equipmentMatches = (List<EquipmentServiceReference>) createQuery
				

		return allMatches;
	}
	// ***********************************************
	// U: UPDATE
	// ***********************************************
	@Override
	public EquipmentServiceReference update(Integer id) {
		
		EquipmentServiceReference managedEsr = em.find(EquipmentServiceReference.class, id);
System.out.println("inside update: ESR Object: " + managedEsr);
		if (managedEsr != null) {
			// update the managed object 
			// pre-populate the form with the existing values to avoid verbose code checking each value for being null or not
			if (managedEsr.getEquipName()!= null) {
				managedEsr.setEquipName(managedEsr.getEquipName());
				
				}
			if (managedEsr.getEquipManf()!= null) {
				managedEsr.setEquipManf(managedEsr.getEquipManf());
				}
			
			if (managedEsr.getEquipMdl()!= null) {
				managedEsr.setEquipMdl(managedEsr.getEquipMdl());
				}
			
			if (managedEsr.getEquipSerNum()!= null) {
				managedEsr.setEquipSerNum(managedEsr.getEquipSerNum());
				}
			
			if (managedEsr.getEngManf()!= null) {
				managedEsr.setEngManf(managedEsr.getEngManf());
				}
			
			if (managedEsr.getEngMdl()!= null) {
				managedEsr.setEngMdl(managedEsr.getEngMdl());
				}
			
			if (managedEsr.getEngSerNum()!= null) {
				managedEsr.setEngSerNum(managedEsr.getEngSerNum());
				}
			
			if (managedEsr.getEngOilManf()!= null) {
				managedEsr.setEngOilManf(managedEsr.getEngOilManf());
				}
			
			if (managedEsr.getEngOilType()!= null) {
				managedEsr.setEngOilType(managedEsr.getEngOilType());
				}
			
			if (managedEsr.getEngOilViscGrd()!= null) {
				managedEsr.setEngOilViscGrd(managedEsr.getEngOilViscGrd());
				}
			
			if (managedEsr.getEngOilFltrManf()!= null) {
				managedEsr.setEngOilFltrManf(managedEsr.getEngOilFltrManf());
				}
			
			if (managedEsr.getEngOilFltrPrtNum()!= null) {
				managedEsr.setEngOilFltrPrtNum(managedEsr.getEngOilFltrPrtNum());
				}
			
			if (managedEsr.getEngAirFltrManf()!= null) {
				managedEsr.setEngAirFltrManf(managedEsr.getEngAirFltrManf());
				}
			
			if (managedEsr.getEngAirFltrPrtNum()!= null) {
				managedEsr.setEngAirFltrPrtNum(managedEsr.getEngAirFltrPrtNum());
				}
			
			if (managedEsr.getEngFuelSpec()!= null) {
				managedEsr.setEngFuelSpec(managedEsr.getEngFuelSpec());
				}
			
			if (managedEsr.getEngFuelFltrManf()!= null) {
				managedEsr.setEngFuelFltrManf(managedEsr.getEngFuelFltrManf());
				}
			
			if (managedEsr.getEngFuelFltrPrtNum()!= null) {
				managedEsr.setEngFuelFltrPrtNum(managedEsr.getEngFuelFltrPrtNum());
				}
			
			if (managedEsr.getEngFuelOil()!= null) {
				managedEsr.setEngFuelOil(managedEsr.getEngFuelOil());
				}
			
			if (managedEsr.getEngFuelOilManf()!= null) {
				managedEsr.setEngFuelOilManf(managedEsr.getEngFuelOilManf());
				}
			
			if (managedEsr.getEngFuelOilName()!= null) {
				managedEsr.setEngFuelOilName(managedEsr.getEngFuelOilName());
				}
			
			if (managedEsr.getEngFuelOilSerNum()!= null) {
			managedEsr.setEngFuelOilSerNum(managedEsr.getEngFuelOilSerNum());
			}
			
			if (managedEsr.getEquipConsName()!= null) {
				managedEsr.setEquipConsName(managedEsr.getEquipConsName());
				}
			
			if (managedEsr.getEquipConsManf()!= null) {
				managedEsr.setEquipConsManf(managedEsr.getEquipConsManf());
				}
			
			if (managedEsr.getEquipConsPrtNum()!= null) {
				managedEsr.setEquipConsPrtNum(managedEsr.getEquipConsPrtNum());
				}
			
			if (managedEsr.getEquipConsName2()!= null) {
				managedEsr.setEquipConsName2(managedEsr.getEquipConsName2());
				}
			
			if (managedEsr.getEquipConsManf2()!= null) {
				managedEsr.setEquipConsManf2(managedEsr.getEquipConsManf2());
				}
			
			if (managedEsr.getEquipConsPrtNum2()!= null) {
				managedEsr.setEquipConsPrtNum2(managedEsr.getEquipConsPrtNum2());
				}
			
			if (managedEsr.getEquipConsName3()!= null) {
				managedEsr.setEquipConsName3(managedEsr.getEquipConsName3());
				}
			
			if (managedEsr.getEquipConsManf3()!= null) {
				managedEsr.setEquipConsManf3(managedEsr.getEquipConsManf3());
				}
			
			if (managedEsr.getEquipConsPrtNum3()!= null) {
				managedEsr.setEquipConsPrtNum3(managedEsr.getEquipConsPrtNum3());
				}
			// PROBLEM: APPEND INSTEAD OF RESETTING. Problem can be fixed with pre-populating the entries in the JSP.
			if (managedEsr.getEquipNotes()!= null) {
				managedEsr.setEquipNotes(managedEsr.getEquipNotes());
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