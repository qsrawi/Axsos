package com.codingdojo.dojosandningas.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojosandningas.models.Dojo;

public interface DojoRepo extends CrudRepository<Dojo,Long> {
	List<Dojo> findAll();
}
