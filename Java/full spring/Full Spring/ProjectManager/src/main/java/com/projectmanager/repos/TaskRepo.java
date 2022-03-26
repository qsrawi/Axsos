package com.projectmanager.repos;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projectmanager.models.Project;
import com.projectmanager.models.Task;
import com.projectmanager.models.User;

@Repository
public  interface TaskRepo  extends CrudRepository<Task, Long> {
	List<Task>findAll();
	
	}
