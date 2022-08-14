package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference;

public interface EquipmentDAO {
	// C: CREATE
	EquipmentServiceReference create(EquipmentServiceReference esr);
	
	// R: RETRIEVE
	EquipmentServiceReference findById(int equpId);
	List<EquipmentServiceReference> findByKeyword(String input);
	List<EquipmentServiceReference> findAllEquipment();
	
	// U: UPDATE
	EquipmentServiceReference update(int id, EquipmentServiceReference equipment);
	
	// D: DESTROY
	boolean destroy(int id);


	
	
}
