package com.projectmanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanager.models.Project;
import com.projectmanager.models.Task;
import com.projectmanager.models.User;
import com.projectmanager.repos.TaskRepo;

@Service
public class TaskService {
@Autowired
TaskRepo taskRepo;

public List<Task> allTasks(){
	return taskRepo.findAll();
}
public void createTask(Task newTask, Project project,User user) {
	newTask.setUser(user);
	newTask.setProject(project);	
	taskRepo.save(newTask);
}
}
