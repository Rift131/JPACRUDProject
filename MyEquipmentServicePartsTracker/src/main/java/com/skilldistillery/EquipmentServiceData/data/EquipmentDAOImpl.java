package com.skilldistillery.EquipmentServiceData.data;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference;

@Service
@Transactional
public class EquipmentDAOImpl implements EquipmentDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public EquipmentServiceReference findById(int id) {
		return em.find(EquipmentServiceReference.class, id);
	}

	@Override
	public List<EquipmentServiceReference> findAll() {

		return null;
	}
}