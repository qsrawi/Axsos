package com.codingdojo.SaveTravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.SaveTravels.models.Expense;
import com.codingdojo.SaveTravels.repos.TravelRepo;

@Service
public class TravelService {
	
	private final TravelRepo travelRepo;
	public TravelService(TravelRepo travelRepo) {
		this.travelRepo=travelRepo;
	}
	
	public List<Expense> allExpense(){
		return travelRepo.findAll();
	}
	
	public Expense createExpense(Expense expense) {
		return travelRepo.save(expense);
	}
	
    public Expense findExpense(Long id) {
        Optional<Expense> optionalExpense = travelRepo.findById(id);
        if(optionalExpense.isPresent()) {
            return optionalExpense.get();
        } else {
            return null;
        }
    }
    public Expense updateExpense(Expense expense) {
    	Expense updatedexpense = travelRepo.findById(expense.getId()).orElse(null);
    	updatedexpense.setName(expense.getName());
    	updatedexpense.setDescription(expense.getDescription());
    	updatedexpense.setVendor(expense.getVendor());
    	updatedexpense.setAmount(expense.getAmount());
        	return travelRepo.save(updatedexpense);
		}
		
	public void deleteExpense(Long id) {
		travelRepo.deleteById(id);
	}
    
    
    
}
