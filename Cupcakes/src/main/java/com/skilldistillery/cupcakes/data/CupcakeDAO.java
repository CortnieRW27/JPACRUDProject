package com.skilldistillery.cupcakes.data;

import java.util.List;

import com.skilldistillery.cupcakes.entities.Cupcake;

public interface CupcakeDAO {

	
	Cupcake findId(int cupcakeId);
	
	List<Cupcake> findAll();
	
	Cupcake create(Cupcake cupcake);
	
	Cupcake update (int cupcakeId, Cupcake cupcake);
	
	boolean deleteById(int cupcakeId);
}
