package com.skilldistillery.EquipmentServiceData.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "equipment_service_reference")
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
	private String equipConsName;
	@Column(name = "equipment_consumable_manufacturer")
	private String equipConsManf;
	@Column(name = "equipment_consumable_part_number")
	private String equipConsPrtNum;
	
	@Column(name = "equipment_consumable_name_2")
	private String equipConsName2;
	@Column(name = "equipment_consumable_manufacturer_2")
	private String equipConsManf2;
	@Column(name = "equipment_consumable_part_number_2")
	private String equipConsPrtNum2;
	
	@Column(name = "equipment_consumable_name_3")
	private String equipConsName3;
	@Column(name = "equipment_consumable_manufacturer_3")
	private String equipConsManf3;
	@Column(name = "equipment_consumable_part_number_3")
	private String equipConsPrtNum3;
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


	public String getEquipConsName() {
		return equipConsName;
	}


	public void setEquipConsName(String equipConsName) {
		this.equipConsName = equipConsName;
	}


	public String getEquipConsManf() {
		return equipConsManf;
	}


	public void setEquipConsManf(String equipConsManf) {
		this.equipConsManf = equipConsManf;
	}


	public String getEquipConsPrtNum() {
		return equipConsPrtNum;
	}


	public void setEquipConsPrtNum(String equipConsPrtNum) {
		this.equipConsPrtNum = equipConsPrtNum;
	}


	public String getEquipConsName2() {
		return equipConsName2;
	}


	public void setEquipConsName2(String equipConsName2) {
		this.equipConsName2 = equipConsName2;
	}


	public String getEquipConsManf2() {
		return equipConsManf2;
	}


	public void setEquipConsManf2(String equipConsManf2) {
		this.equipConsManf2 = equipConsManf2;
	}


	public String getEquipConsPrtNum2() {
		return equipConsPrtNum2;
	}


	public void setEquipConsPrtNum2(String equipConsPrtNum2) {
		this.equipConsPrtNum2 = equipConsPrtNum2;
	}


	public String getEquipConsName3() {
		return equipConsName3;
	}


	public void setEquipConsName3(String equipConsName3) {
		this.equipConsName3 = equipConsName3;
	}


	public String getEquipConsManf3() {
		return equipConsManf3;
	}


	public void setEquipConsManf3(String equipConsManf3) {
		this.equipConsManf3 = equipConsManf3;
	}


	public String getEquipConsPrtNum3() {
		return equipConsPrtNum3;
	}


	public void setEquipConsPrtNum3(String equipConsPrtNum3) {
		this.equipConsPrtNum3 = equipConsPrtNum3;
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
				+ ", engFuelOilName=" + engFuelOilName + ", engFuelOilSerNum=" + engFuelOilSerNum + ", equipConsName="
				+ equipConsName + ", equipConsManf=" + equipConsManf + ", equipConsPrtNum=" + equipConsPrtNum
				+ ", equipConsName2=" + equipConsName2 + ", equipConsManf2=" + equipConsManf2 + ", equipConsPrtNum2="
				+ equipConsPrtNum2 + ", equipConsName3=" + equipConsName3 + ", equipConsManf3=" + equipConsManf3
				+ ", equipConsPrtNum3=" + equipConsPrtNum3 + ", equipNotes=" + equipNotes + "]";
	}


	
	

}
