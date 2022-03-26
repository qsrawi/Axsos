package com.projectmanager.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotEmpty(message="title is required!")
	@Size(min=3, max=30, message="Project title must be between 3 and 30 characters")
	private String title;

	@NotEmpty(message="Description is required!")
	@Size(min=3, max=30, message="Project description must be between 5 and 200 characters")
	private String description;
	

	@Future(message="The date must be in the future")
	@DateTimeFormat(iso = ISO.DATE, fallbackPatterns = {"mm/dd/yyyy" })
	private LocalDate dueDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User manager;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "users_projects", 
        joinColumns = @JoinColumn(name = "project_id"), 
        inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;
	
	@OneToMany(mappedBy="project", cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Task> tasks;
	

	
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;

	
	
	public Project() {}



	public Project(
			@NotEmpty(message = "title is required!") @Size(min = 3, max = 30, message = "Project title must be between 3 and 30 characters") String title,
			@NotEmpty(message = "Description is required!") @Size(min = 3, max = 30, message = "Project description must be between 5 and 200 characters") String description,
			@Future(message = "The date must be in the future") LocalDate dueDate, List<User> users, User manager) {
		super();
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.users = users;
		this.manager = manager;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


	public User getManager() {
		return manager;
	}


	public void setManager(User manager) {
		this.manager = manager;
	}


	public List<Task> getTasks() {
		return tasks;
	}



	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}



	@PrePersist
	protected void onCreate(){
	    this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate(){
	    this.updatedAt = new Date();
	}
}
