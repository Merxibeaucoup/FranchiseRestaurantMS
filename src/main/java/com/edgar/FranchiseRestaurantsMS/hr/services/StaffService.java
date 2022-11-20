package com.edgar.FranchiseRestaurantsMS.hr.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edgar.FranchiseRestaurantsMS.exceptions.NewStaffConflictException;
import com.edgar.FranchiseRestaurantsMS.exceptions.UserNotFoundException;
import com.edgar.FranchiseRestaurantsMS.hr.constants.EmployeeStatus;
import com.edgar.FranchiseRestaurantsMS.hr.constants.StaffRole;
import com.edgar.FranchiseRestaurantsMS.hr.models.Staff;
import com.edgar.FranchiseRestaurantsMS.hr.repositories.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
	
	
	
	//*********   Checks
	public boolean isExists(Long id) {
        if(staffRepository.existsById(id)) {
            return true;
        }
        else return false;
    }
	
	public boolean isExists(String email) {
        if(staffRepository.existsByEmail(email)) {
            return true;
        }
        else return false;
    }
	
	
	
	
// add new 
	
	public Staff addNewStaff (Staff staff) throws Exception{
		
		if(isExists(staff.getEmail())) {
			throw new NewStaffConflictException("A Staff with the Email"+ staff.getEmail() + "already exists");
		}
		else {
			Staff s = new Staff();
			
//			pre-setters
			
			s.setEmployeestatus(EmployeeStatus.FULLTIME);  //default hire status
			s.setStaffRole(StaffRole.USER); //default role, probably will only see home page
			s.setHireDate(LocalDate.now());		
			
			return staffRepository.save(s);
		}
		
		
	}
	
	
	
//	get all
	
	public List<Staff> getAll(){
		return staffRepository.findAll();
	}
	
	
	
//	get staff by Id 
	
	public Staff getStaffById(Long id) {
		if(isExists(id)) {
			return staffRepository.findById(id).get();
		}
		else {
			 throw new UserNotFoundException("There is no such employee with given id: '" + id + "'");
		}
	}
	
//	get staff by Email
	
	public Staff getUserByEmail(String email) {
        if(isExists(email)) {
            return staffRepository.findStaffByEmail(email).get();
        }
        else throw new UserNotFoundException("There is no employee with email: '" + email + "'");
    }
	
	
	
	
//	delete staff by id
	
	public void deleteStaffById(Long id) {
		
		if(isExists(id)) {
			 staffRepository.deleteById(id);
		}
		else {
			 throw new UserNotFoundException("There is no such employee with given id: '" + id + "'");
		}
		
	}

}
