package com.codingdojo.SaveTravels.apis;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.SaveTravels.models.Expense;
import com.codingdojo.SaveTravels.services.TravelService;

@RestController
public class ExpenseApi {
	
	private final TravelService travelService;
	public ExpenseApi(TravelService travelService) {
		this.travelService=travelService;
	}
	
	@RequestMapping("/api/expense")
	public List<Expense> getAll(){
		return travelService.allExpense();
	}
	@RequestMapping(value="/api/expense", method=RequestMethod.POST)
	public Expense createExpense(@RequestParam(value="name") String name, @RequestParam(value="description") String desc, @RequestParam(value="vendor") String vendor, @RequestParam(value="amount") Integer amount) {
		Expense expense =new Expense(name , desc , vendor , amount);
		return travelService.createExpense(expense);
	}
}
