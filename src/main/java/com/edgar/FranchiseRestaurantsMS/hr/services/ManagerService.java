package com.edgar.FranchiseRestaurantsMS.hr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.FranchiseRestaurantsMS.hr.models.Manager;
import com.edgar.FranchiseRestaurantsMS.hr.repositories.ManagerRepository;

@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository managerRepository;
	
	
	
//	add && || update 
	public Manager save(Manager manager) {		
		return managerRepository.save(manager);
	}
	
	
//	delete	
	public void delete( Long id) {
		managerRepository.deleteById(id);
		
	}	
	
//	get all
	public List <Manager> getAll(){
		return managerRepository.findAll();		
	}
	
//	get one
	public Manager getOne(Long id) {
		return managerRepository.findById(id).get();
	}
	
	
//	create employees

}
