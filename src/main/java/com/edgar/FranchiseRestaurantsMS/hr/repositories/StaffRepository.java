package com.edgar.FranchiseRestaurantsMS.hr.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.FranchiseRestaurantsMS.hr.models.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
	
	boolean existsByEmail(String email);
	
	Optional<Staff> findStaffByEmail(String email);
	
	

}
