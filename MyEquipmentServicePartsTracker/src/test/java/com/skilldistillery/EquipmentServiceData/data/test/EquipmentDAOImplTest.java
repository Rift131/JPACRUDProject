package com.skilldistillery.EquipmentServiceData.data.test;

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

import com.skilldistillery.EquipmentServiceData.data.EquipmentDAO;
import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference; 

class EquipmentDAOImplTest {


	private static EntityManagerFactory emf;
	private EntityManager em;
	private EquipmentServiceReference esr;
	private EquipmentDAO dao;
	
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
	void test() {
		assertNotNull(esr);
		assertEquals("Chainsaw", esr.getEquipName());
	}
	
//	@Test
//	void assert_find_equipment_by_id_1_is_stihl() {
//		EquipmentServiceReference t = dao.findById(1);
//		assertNotNull(esr);
//		assertEquals("Stihl", t.getEquipManf());
//	}
	

}
