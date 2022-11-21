package com.edgar.FranchiseRestaurantsMS.hr.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edgar.FranchiseRestaurantsMS.hr.models.Staff;
import com.edgar.FranchiseRestaurantsMS.hr.services.StaffService;

@RestController
@RequestMapping("api/staff")
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	//add new
	@PostMapping("/add")
	public ResponseEntity<Staff> addNewStaff( @Valid @RequestBody Staff staff) throws Exception {
			
			Staff newStaff = staffService.addNewStaff(staff);
			return ResponseEntity.ok(newStaff);		
		
	}
	
	

}
