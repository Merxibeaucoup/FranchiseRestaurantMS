package com.edgar.FranchiseRestaurantsMS.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.FranchiseRestaurantsMS.hr.models.Chef;
import com.edgar.FranchiseRestaurantsMS.hr.repositories.ChefRepository;

@Service
public class ChefService {
	
	@Autowired
	private ChefRepository chefRepository;
	
	
//	add && || update 
	public Chef save(Chef chef) {		
		return chefRepository.save(chef);
	}
	
	
//	delete	
	public void delete( Long id) {
		chefRepository.deleteById(id);
		
	}	
	
//	get all
	public List <Chef> getAll(){
		return chefRepository.findAll();		
	}
	
//	get one
	public Chef getOne(Long id) {
		return chefRepository.findById(id).get();
	}
		

	
//	take order 

}
