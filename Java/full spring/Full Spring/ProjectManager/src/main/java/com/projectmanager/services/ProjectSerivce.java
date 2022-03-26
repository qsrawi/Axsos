package com.projectmanager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectmanager.models.Project;
import com.projectmanager.models.User;
import com.projectmanager.repos.ProjectRepo;
import com.projectmanager.repos.UserRepo;

@Service
public class ProjectSerivce {
	@Autowired
	ProjectRepo projectRepo;
	@Autowired
	UserRepo userRepo;
public List<Project> allProjects(){
	return projectRepo.findAll();
}

public void createProject(User user ,Project project) {
	project.setManager(user);
	user.getJoined().add(project);
    projectRepo.save(project);
    userRepo.save(user);

}


public void joinProject(User user ,Project project) {
	
	user.getJoined().add(project);
    
    userRepo.save(user);

}

public void leaveProject(User user ,Project project) {
	user.getJoined().remove(project);
    userRepo.save(user);
}


public Project findProject(Long id) {
    Optional<Project> j =projectRepo.findById(id);
    if(j.isPresent()) {
    	return j.get();
    }else {
    	return null;
    	}
   }
public List<Project> notJoined(User user) {
	return projectRepo.findByUsersNotContains(user);
}

public List<Project> areJoined(User user) {
	return projectRepo.findByUsersContains(user);
}

public void updateProject(Project updatedProject, Long proId) {

	Project project = this.findProject(proId);
	project.setTitle(updatedProject.getTitle());
	project.setDescription(updatedProject.getDescription());
	project.setDueDate(updatedProject.getDueDate());
	projectRepo.save(project);
}

public boolean isExist(User user,Project project) {

	return user.getJoined().contains(project);
}
public void deleteProject(Long id) {
	 projectRepo.deleteById(id);
}
}
