package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReferences;

@Service
@Transactional
public class EquipmentDAOImpl implements EquipmentDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public EquipmentServiceReferences findById(int id) {
		return em.find(EquipmentServiceReferences.class, id);
	}

	@Override
	public List<EquipmentServiceReferences> findAll() {

		return null;
	}
}