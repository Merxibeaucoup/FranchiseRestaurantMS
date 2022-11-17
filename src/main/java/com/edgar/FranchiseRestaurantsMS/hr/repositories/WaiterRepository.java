package com.edgar.FranchiseRestaurantsMS.hr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edgar.FranchiseRestaurantsMS.hr.models.Waiter;

@Repository
public interface WaiterRepository extends JpaRepository<Waiter, Long> {

}
