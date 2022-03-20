package com.codingdojo.dojosandningas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandningas.models.Dojo;
import com.codingdojo.dojosandningas.models.Ninja;
import com.codingdojo.dojosandningas.services.DojoService;
import com.codingdojo.dojosandningas.services.NinjaService;

@Controller
public class DojoController {
@Autowired
DojoService dojoService;
@Autowired
NinjaService ninjaService;

@GetMapping("dojos/new")
public String home(@ModelAttribute("dojo")Dojo dojo) {
	return "index.jsp";
}
@PostMapping("dojos/new")
public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo,BindingResult result ) {
	 if (result.hasErrors()) {
	        return "index.jsp";
	    } else {
	    	dojoService.createDojo(dojo);
	        return "redirect:/ninjas/new";
	    }
	 }
@GetMapping("ninjas/new")
	public String ninjaHome(@ModelAttribute("ninjas")Ninja ninja,Model model) {
		List<Dojo> dojos=dojoService.allDojos();
		model.addAttribute("dojos",dojos);
	 	return "ninja.jsp";
	 }
@PostMapping("ninjas/new")
public String createNinga(@ModelAttribute("ninjas")Ninja ninja,BindingResult result) {
	 if (result.hasErrors()) {
	        return "ninja.jsp";
	    } else {
	    	ninjaService.createNinja(ninja);
	        return "redirect:/ninjas/new";
	    }
	 }
@GetMapping("dojos/{id}")
public String showNinjas(@PathVariable("id") Long id,Model model) {
	Dojo dojo =dojoService.findDojo(id);
	model.addAttribute("dojo",dojo);
 	return "show.jsp";
 }
	
}

