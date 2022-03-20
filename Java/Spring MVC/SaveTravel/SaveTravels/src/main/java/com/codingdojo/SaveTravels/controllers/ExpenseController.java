package com.codingdojo.SaveTravels.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.SaveTravels.models.Expense;
import com.codingdojo.SaveTravels.services.TravelService;


@Controller

public class ExpenseController {

    @Autowired
    TravelService travelService;

@GetMapping("/expense")
public String allTravels(Model model,Expense expense) {
    List<Expense>expenses = travelService.allExpense();
    model.addAttribute("expenses", expenses);
    return "index.jsp";
}
@PostMapping("/expense")
public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
    if (result.hasErrors()) {
        return "index.jsp";
    } else {
       travelService.createExpense(expense);
        return "redirect:/expense";
    }
   }
@GetMapping("/expense/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Expense expense = travelService.findExpense(id);
        model.addAttribute("expense", expense);
        return "edit.jsp";
}
@PutMapping("/expense/{id}")
public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
    if (result.hasErrors()) {
        return "edit.jsp";
    } else {
    	travelService.updateExpense(expense);
        return "redirect:/expense";
    }
}
@DeleteMapping("/expense/{id}")
public String destroy(@PathVariable("id") Long id) {
    travelService.deleteExpense(id);
    return "redirect:/expense";
}
}