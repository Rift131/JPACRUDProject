package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
	public EquipmentServiceReference findById(Integer id) {
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
	public EquipmentServiceReference update(Integer id, EquipmentServiceReference esr) {
		
		EquipmentServiceReference managedEsr = em.find(EquipmentServiceReference.class, id);
System.out.println("inside update: ESR Object: " + managedEsr);
		
			// update the managed object 
			// pre-populate the form with the existing values to avoid verbose code checking each value for being null or not
				managedEsr.setEquipName(esr.getEquipName());
				managedEsr.setEquipManf(esr.getEquipManf());
				managedEsr.setEquipMdl(esr.getEquipMdl());
				managedEsr.setEquipSerNum(esr.getEquipSerNum());
				managedEsr.setEngManf(esr.getEngManf());
				managedEsr.setEngMdl(esr.getEngMdl());
				managedEsr.setEngSerNum(esr.getEngSerNum());
				managedEsr.setEngOilManf(esr.getEngOilManf());
				managedEsr.setEngOilType(esr.getEngOilType());
				managedEsr.setEngOilViscGrd(esr.getEngOilViscGrd());
				managedEsr.setEngOilFltrManf(esr.getEngOilFltrManf());
				managedEsr.setEngOilFltrPrtNum(esr.getEngOilFltrPrtNum());
				managedEsr.setEngAirFltrManf(esr.getEngAirFltrManf());
				managedEsr.setEngAirFltrPrtNum(esr.getEngAirFltrPrtNum());
				managedEsr.setEngFuelSpec(esr.getEngFuelSpec());
				managedEsr.setEngFuelFltrManf(esr.getEngFuelFltrManf());
				managedEsr.setEngFuelFltrPrtNum(esr.getEngFuelFltrPrtNum());
				managedEsr.setEngFuelOil(esr.getEngFuelOil());
				managedEsr.setEngFuelOilManf(esr.getEngFuelOilManf());
				managedEsr.setEngFuelOilName(esr.getEngFuelOilName());
			managedEsr.setEngFuelOilSerNum(esr.getEngFuelOilSerNum());
				managedEsr.setEquipConsName(esr.getEquipConsName());
				managedEsr.setEquipConsManf(esr.getEquipConsManf());
				managedEsr.setEquipConsPrtNum(esr.getEquipConsPrtNum());
				managedEsr.setEquipConsName2(esr.getEquipConsName2());
				managedEsr.setEquipConsName2(esr.getEquipConsManf2());
				managedEsr.setEquipConsPrtNum2(esr.getEquipConsPrtNum2());
				managedEsr.setEquipConsName3(esr.getEquipConsName3());
				managedEsr.setEquipConsManf3(esr.getEquipConsManf3());
				managedEsr.setEquipConsPrtNum3(esr.getEquipConsPrtNum3());
			// PROBLEM: APPEND INSTEAD OF RESETTING. Problem can be fixed with pre-populating the entries in the JSP.
				managedEsr.setEquipNotes(esr.getEquipNotes());
	// tranactions (begin and commit) and emfs already exist
		//em.persist(managedEsr);
		return managedEsr;
	}
	// ***********************************************
	// D: DESTROY
	// ***********************************************

	@Override
	public boolean destroy(Integer delete) {
		EquipmentServiceReference remove = findById(delete);
		boolean equipmentRemoved = false;
		System.out.println("in DAO destroy");
		System.out.println("equipmentDelete: " + delete);
		if (remove != null) {
			em.remove(remove);
			equipmentRemoved = !em.contains(remove);
		}
		return equipmentRemoved;
	}



}