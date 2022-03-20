package com.codingdojo.SaveTravels.repos;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.SaveTravels.models.Expense;

@Repository
public interface TravelRepo extends CrudRepository<Expense, Long> {
	List<Expense> findAll();
	
}
