package com.skilldistillery.EquipmentServiceData.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="equipment_service_references")
public class EquipmentServiceReferences {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="equipment_name")
	private String equipmentName;
	
	
	public EquipmentServiceReferences() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEquipmentName() {
		return equipmentName;
	}


	public void setEquipmentName(String equipmentName) {
		this.equipmentName = equipmentName;
	}


	@Override
	public String toString() {
		return "EquipmentServiceReferences [id=" + id + ", equipmentName=" + equipmentName + "]";
	}

	
}
