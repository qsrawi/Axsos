package com.projectmanager.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.projectmanager.models.Project;
import com.projectmanager.models.User;

@Repository
public interface ProjectRepo extends CrudRepository<Project, Long> {
List<Project>findAll();
List<Project> findByUsersNotContains(User user);
List<Project> findByUsersContains(User user);
}
