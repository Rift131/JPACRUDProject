package com.skilldistillery.EquipmentServiceData.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipmentServiceReferenceTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private EquipmentServiceReference esr;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("EquipmentServiceData");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		esr = em.find(EquipmentServiceReference.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		esr = null;
	}

	@Test
	void test_row_1_not_void() {
		assertNotNull(esr);
	}
	
	@Test
	void test_row_1_equipment_name_is_Chainsaw() {
		assertEquals("Chainsaw", esr.getEquipName());
	}
	@Test
	void test_row_1_equipment_verify_expected_SN() {
		assertEquals("12345679", esr.getEquipSerNum());
	}
	@Test
	void test_row_1_equipment_verify_expected_engine_manufacturer() {
		assertEquals("Kohler", esr.getEngManf());
	}
	@Test
	void test_row_1_equipment_verify_expected_oil_manf() {
		assertEquals("Stihl", esr.getEngFuelFltrManf());
	}
	@Test
	void test_row_1_equipment_verify_expected_consumable_part_number_2_part_number() {
		assertEquals("OZ56-212", esr.getEquipConsPrtNum2());
	}
}
