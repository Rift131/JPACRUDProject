package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReferences;

public interface EquipmentDAO {
	// need name of object here
	EquipmentServiceReferences findById(int equpId);
	List<EquipmentServiceReferences> findAll();
	
	
}
