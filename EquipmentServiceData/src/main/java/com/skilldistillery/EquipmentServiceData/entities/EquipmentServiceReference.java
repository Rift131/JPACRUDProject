package com.skilldistillery.EquipmentServiceData.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_service_references")
public class EquipmentServiceReference {

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
	@Column(name = "engine_oil_type")
	private String engOilType;
	@Column(name = "engine_oil_viscosity_grade")
	private String engOilViscGrd;
	@Column(name = "engine_oil_filter_manufacturer")
	private String engOilFltrManf;
	@Column(name = "engine_oil_filer_part_number")
	private String engOilFltrPrtNum;
	@Column(name = "engine_air_filter_manufacturer")
	private String engAirFltrManf;
	@Column(name = "engine_air_filter_part_number")
	private String engAirFltrPrtNum;
	@Column(name = "egnine_fuel_specifications")
	private String engFuelSpec;
	@Column(name = "engine_fuel_filter_manufacturer")
	private String engFuelFltrManf;
	@Column(name = "engine_fuel_filter_part_number")
	private String engFuelFltrPrtNum;
	// DEFAULT VALUE: TINYINT(1) (FALSE)
		@Column(name = "engine_fuel_oil")
		private Boolean engFuelOil;
	@Column(name = "engine_fuel_oil_manufacturer")
	private String engFuelOilManf;
	@Column(name = "engine_fuel_oil_name")
	private String engFuelOilName;
	@Column(name = "engine_fuel_oil_serial_number")
	private String engFuelOilSerNum;
	
	@Column(name = "equipment_consumable_name")
	private String engConsName;
	@Column(name = "equipment_consumable_manufacturer")
	private String engConsManf;
	@Column(name = "equipment_consumable_part_number")
	private String engConsPrtNum;
	
	@Column(name = "equipment_consumable_name_2")
	private String engConsName2;
	@Column(name = "equipment_consumable_manufacturer_2")
	private String engConsManf2;
	@Column(name = "equipment_consumable_part_number_2")
	private String engConsPrtNum2;
	
	@Column(name = "equipment_consumable_name_3")
	private String engConsName3;
	@Column(name = "equipment_consumable_manufacturer_3")
	private String engConsManf3;
	@Column(name = "equipment_consumable_part_number_3")
	private String engConsPrtNum3;
	@Column(name = "equipment_notes")
	private String equipNotes;
	
	
	public EquipmentServiceReference() {
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


	public String getEngOilType() {
		return engOilType;
	}


	public void setEngOilType(String engOilType) {
		this.engOilType = engOilType;
	}


	public String getEngOilViscGrd() {
		return engOilViscGrd;
	}


	public void setEngOilViscGrd(String engOilViscGrd) {
		this.engOilViscGrd = engOilViscGrd;
	}


	public String getEngOilFltrManf() {
		return engOilFltrManf;
	}


	public void setEngOilFltrManf(String engOilFltrManf) {
		this.engOilFltrManf = engOilFltrManf;
	}


	public String getEngOilFltrPrtNum() {
		return engOilFltrPrtNum;
	}


	public void setEngOilFltrPrtNum(String engOilFltrPrtNum) {
		this.engOilFltrPrtNum = engOilFltrPrtNum;
	}


	public String getEngAirFltrManf() {
		return engAirFltrManf;
	}


	public void setEngAirFltrManf(String engAirFltrManf) {
		this.engAirFltrManf = engAirFltrManf;
	}


	public String getEngAirFltrPrtNum() {
		return engAirFltrPrtNum;
	}


	public void setEngAirFltrPrtNum(String engAirFltrPrtNum) {
		this.engAirFltrPrtNum = engAirFltrPrtNum;
	}


	public String getEngFuelSpec() {
		return engFuelSpec;
	}


	public void setEngFuelSpec(String engFuelSpec) {
		this.engFuelSpec = engFuelSpec;
	}


	public String getEngFuelFltrManf() {
		return engFuelFltrManf;
	}


	public void setEngFuelFltrManf(String engFuelFltrManf) {
		this.engFuelFltrManf = engFuelFltrManf;
	}


	public String getEngFuelFltrPrtNum() {
		return engFuelFltrPrtNum;
	}


	public void setEngFuelFltrPrtNum(String engFuelFltrPrtNum) {
		this.engFuelFltrPrtNum = engFuelFltrPrtNum;
	}


	public Boolean getEngFuelOil() {
		return engFuelOil;
	}


	public void setEngFuelOil(Boolean engFuelOil) {
		this.engFuelOil = engFuelOil;
	}


	public String getEngFuelOilManf() {
		return engFuelOilManf;
	}


	public void setEngFuelOilManf(String engFuelOilManf) {
		this.engFuelOilManf = engFuelOilManf;
	}


	public String getEngFuelOilName() {
		return engFuelOilName;
	}


	public void setEngFuelOilName(String engFuelOilName) {
		this.engFuelOilName = engFuelOilName;
	}


	public String getEngFuelOilSerNum() {
		return engFuelOilSerNum;
	}


	public void setEngFuelOilSerNum(String engFuelOilSerNum) {
		this.engFuelOilSerNum = engFuelOilSerNum;
	}


	public String getEngConsName() {
		return engConsName;
	}


	public void setEngConsName(String engConsName) {
		this.engConsName = engConsName;
	}


	public String getEngConsManf() {
		return engConsManf;
	}


	public void setEngConsManf(String engConsManf) {
		this.engConsManf = engConsManf;
	}


	public String getEngConsPrtNum() {
		return engConsPrtNum;
	}


	public void setEngConsPrtNum(String engConsPrtNum) {
		this.engConsPrtNum = engConsPrtNum;
	}


	public String getEngConsName2() {
		return engConsName2;
	}


	public void setEngConsName2(String engConsName2) {
		this.engConsName2 = engConsName2;
	}


	public String getEngConsManf2() {
		return engConsManf2;
	}


	public void setEngConsManf2(String engConsManf2) {
		this.engConsManf2 = engConsManf2;
	}


	public String getEngConsPrtNum2() {
		return engConsPrtNum2;
	}


	public void setEngConsPrtNum2(String engConsPrtNum2) {
		this.engConsPrtNum2 = engConsPrtNum2;
	}


	public String getEngConsName3() {
		return engConsName3;
	}


	public void setEngConsName3(String engConsName3) {
		this.engConsName3 = engConsName3;
	}


	public String getEngConsManf3() {
		return engConsManf3;
	}


	public void setEngConsManf3(String engConsManf3) {
		this.engConsManf3 = engConsManf3;
	}


	public String getEngConsPrtNum3() {
		return engConsPrtNum3;
	}


	public void setEngConsPrtNum3(String engConsPrtNum3) {
		this.engConsPrtNum3 = engConsPrtNum3;
	}


	public String getEquipNotes() {
		return equipNotes;
	}


	public void setEquipNotes(String equipNotes) {
		this.equipNotes = equipNotes;
	}


	@Override
	public String toString() {
		return "EquipmentServiceReference [id=" + id + ", equipName=" + equipName + ", equipManf=" + equipManf
				+ ", equipMdl=" + equipMdl + ", equipSerNum=" + equipSerNum + ", engManf=" + engManf + ", engMdl="
				+ engMdl + ", engSerNum=" + engSerNum + ", engOilManf=" + engOilManf + ", engOilType=" + engOilType
				+ ", engOilViscGrd=" + engOilViscGrd + ", engOilFltrManf=" + engOilFltrManf + ", engOilFltrPrtNum="
				+ engOilFltrPrtNum + ", engAirFltrManf=" + engAirFltrManf + ", engAirFltrPrtNum=" + engAirFltrPrtNum
				+ ", engFuelSpec=" + engFuelSpec + ", engFuelFltrManf=" + engFuelFltrManf + ", engFuelFltrPrtNum="
				+ engFuelFltrPrtNum + ", engFuelOil=" + engFuelOil + ", engFuelOilManf=" + engFuelOilManf
				+ ", engFuelOilName=" + engFuelOilName + ", engFuelOilSerNum=" + engFuelOilSerNum + ", engConsName="
				+ engConsName + ", engConsManf=" + engConsManf + ", engConsPrtNum=" + engConsPrtNum + ", engConsName2="
				+ engConsName2 + ", engConsManf2=" + engConsManf2 + ", engConsPrtNum2=" + engConsPrtNum2
				+ ", engConsName3=" + engConsName3 + ", engConsManf3=" + engConsManf3 + ", engConsPrtNum3="
				+ engConsPrtNum3 + ", equipNotes=" + equipNotes + "]";
	}

	
	

}
