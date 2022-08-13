package com.skilldistillery.EquipmentServiceData.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_service_references")
public class EquipmentServiceReferences {

	// REQUIRED NOT NULL FIELDS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "equipment_name")
	private String equipName;
	@Column(name = "equipment_manufacturer")
	private String equipManf;
	@Column(name = "equipment_model")
	private String equipMdl;
	
	
	// NULL DEFAULT FIELDS
	@Column(name = "equipment_serial_number")
	private String equipSerNum;
	@Column(name = "engine_manufacturer")
	private String engManf;
	@Column(name = "engine_model")
	private String engMdl;
	@Column(name = "engine_serial_number")
	private String engSerNum;
	@Column(name = "engine_oil_manufacturer")
	private String engOilManf;
	// DEFAULT VALUE: TINYINT(1) 
	@Column(name = "engine_fuel_oil")
	private Boolean engFuelOil;

	public EquipmentServiceReferences() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEquipName() {
		return equipName;
	}

	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public String getEquipManf() {
		return equipManf;
	}

	public void setEquipManf(String equipManf) {
		this.equipManf = equipManf;
	}

	public String getEquipMdl() {
		return equipMdl;
	}

	public void setEquipMdl(String equipMdl) {
		this.equipMdl = equipMdl;
	}

	public String getEquipSerNum() {
		return equipSerNum;
	}

	public void setEquipSerNum(String equipSerNum) {
		this.equipSerNum = equipSerNum;
	}

	public String getEngManf() {
		return engManf;
	}

	public void setEngManf(String engManf) {
		this.engManf = engManf;
	}

	public String getEngMdl() {
		return engMdl;
	}

	public void setEngMdl(String engMdl) {
		this.engMdl = engMdl;
	}

	public String getEngSerNum() {
		return engSerNum;
	}

	public void setEngSerNum(String engSerNum) {
		this.engSerNum = engSerNum;
	}

	public String getEngOilManf() {
		return engOilManf;
	}

	public void setEngOilManf(String engOilManf) {
		this.engOilManf = engOilManf;
	}

	public Boolean getEngFuelOil() {
		return engFuelOil;
	}

	public void setEngFuelOil(Boolean engFuelOil) {
		this.engFuelOil = engFuelOil;
	}

	@Override
	public String toString() {
		return "EquipmentServiceReferences [id=" + id + ", equipName=" + equipName + ", equipManf=" + equipManf
				+ ", equipMdl=" + equipMdl + ", equipSerNum=" + equipSerNum + ", engManf=" + engManf + ", engMdl="
				+ engMdl + ", engSerNum=" + engSerNum + ", engOilManf=" + engOilManf + ", engFuelOil=" + engFuelOil
				+ "]";
	}

}
