package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.ui.Model;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference;

public interface EquipmentDAO {
	// C: CREATE
	EquipmentServiceReference create(EquipmentServiceReference esr);
	
	// R: RETRIEVE
	EquipmentServiceReference findById(Integer equpId);
	List<EquipmentServiceReference> findByKeyword(String input);
	List<EquipmentServiceReference> findAllEquipment();
	
	// U: UPDATE
	EquipmentServiceReference update(Integer id, EquipmentServiceReference esr);
	
	// D: DESTROY

	boolean destroy(Integer delete);







	
	
}
