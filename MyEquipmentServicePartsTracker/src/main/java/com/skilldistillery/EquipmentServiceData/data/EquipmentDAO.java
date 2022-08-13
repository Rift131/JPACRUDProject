package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference;

public interface EquipmentDAO {
	// need name of object here
	EquipmentServiceReference findById(int equpId);
	List<EquipmentServiceReference> findAll();
	
	
}
