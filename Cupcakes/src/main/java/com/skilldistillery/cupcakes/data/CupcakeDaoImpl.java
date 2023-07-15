package com.skilldistillery.cupcakes.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.cupcakes.entities.Cupcake;

@Service
@Transactional
public class CupcakeDaoImpl implements CupcakeDAO {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Cupcake findId(int cupcakeId) {
		
		return em.find(Cupcake.class, cupcakeId);
	}

	@Override
	public List<Cupcake> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cupcake create(Cupcake cupcake) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cupcake update(int cupcakeId, Cupcake cupcake) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int cupcakeId) {
		// TODO Auto-generated method stub
		return false;
	}

}
