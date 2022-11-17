package com.edgar.FranchiseRestaurantsMS.hr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.FranchiseRestaurantsMS.hr.models.Receptionist;

@Repository
public interface ReceptionistRepository extends JpaRepository<Receptionist, Long> {

}
