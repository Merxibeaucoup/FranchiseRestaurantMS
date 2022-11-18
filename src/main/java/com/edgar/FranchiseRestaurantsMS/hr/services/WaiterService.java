package com.edgar.FranchiseRestaurantsMS.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.FranchiseRestaurantsMS.hr.models.Waiter;
import com.edgar.FranchiseRestaurantsMS.hr.repositories.WaiterRepository;

@Service
public class WaiterService {
	
	
	@Autowired
	private WaiterRepository  waiterRepository;
	
	
	
	
//	add && || update 
	public Waiter save(Waiter waiter) {		
		return waiterRepository.save(waiter);
	}
	
	
//	delete	
	public void delete( Long id) {
		waiterRepository.deleteById(id);
		
	}	
	
//	get all
	public List <Waiter> getAll(){
		return waiterRepository.findAll();		
	}
	
//	get one
	public Waiter getOne(Long id) {
		return waiterRepository.findById(id).get();
	}

}
