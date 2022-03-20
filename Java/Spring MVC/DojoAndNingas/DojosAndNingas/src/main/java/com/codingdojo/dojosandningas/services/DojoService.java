package com.codingdojo.dojosandningas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandningas.models.Dojo;
import com.codingdojo.dojosandningas.repos.DojoRepo;

@Service
public class DojoService {
@Autowired
DojoRepo dojoRepo;
public Dojo createDojo(Dojo dojo) {
	return dojoRepo.save(dojo);
}
public List<Dojo> allDojos(){
	return dojoRepo.findAll();
}
public Dojo findDojo(Long id) {
    Optional<Dojo> optionalDojo = dojoRepo.findById(id);
    if(optionalDojo.isPresent()) {
        return optionalDojo.get();
    } else {
        return null;
    }
}

}
