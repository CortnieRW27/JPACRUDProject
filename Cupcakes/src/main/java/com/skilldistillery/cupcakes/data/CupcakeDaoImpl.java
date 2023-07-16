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
		String jpql = "SELECT cupcake FROM Cupcake cupcake";
		return em.createQuery(jpql, Cupcake.class).getResultList();
	}

	@Override
	public Cupcake create(Cupcake cupcake) {
		em.persist(cupcake);
		return cupcake;
	}

	@Override
	public Cupcake update(int cupcakeId, Cupcake cupcake) {

		Cupcake managedCupcake = em.find(Cupcake.class, cupcakeId);

		managedCupcake.setType(cupcake.getType());
		managedCupcake.setCakeFlavor(cupcake.getCakeFlavor());
		managedCupcake.setIcingFlavor(cupcake.getIcingFlavor());
		managedCupcake.setDescription(cupcake.getDescription());
		managedCupcake.setTheme(cupcake.getTheme());
		managedCupcake.setAmount(cupcake.getAmount());
		managedCupcake.setPrice(cupcake.getPrice());

		return managedCupcake;
	}

	@Override
	public boolean deleteById(int cupcakeId) {

		Cupcake managedCupcake = em.find(Cupcake.class, cupcakeId);
		if (managedCupcake == null) {
			return false;
		}
		boolean success = false;
		em.remove(managedCupcake);
		if (!em.contains(managedCupcake)) {
			success = true;
		}
		return success;

	}

}
