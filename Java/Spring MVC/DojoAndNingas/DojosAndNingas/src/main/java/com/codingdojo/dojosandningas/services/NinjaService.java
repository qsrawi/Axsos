package com.codingdojo.dojosandningas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandningas.models.Ninja;
import com.codingdojo.dojosandningas.repos.NinjaRepo;


@Service
public class NinjaService {
	@Autowired
	NinjaRepo ninjaRepo;
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}

}
