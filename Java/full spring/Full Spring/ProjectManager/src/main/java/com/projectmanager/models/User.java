package com.projectmanager.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="Firstname is required!")
	@Size(min=3, max=30, message="Username must be between 3 and 30 characters")
	private String firstName;
	
	@NotEmpty(message="Lastname is required!")
	@Size(min=3, max=30, message="Username must be between 3 and 30 characters")
	private String lastName;
	
	@NotEmpty(message="Email is required!")
	@Email(message="Please enter a valid email!")
	private String email;
	
	@NotEmpty(message="Password is required!")
	@Size(min=8, max=128, message="Password must be between 8 and 128 characters")
	private String password;
	
	@Transient
	@NotEmpty(message="Confirm Password is required!")
	@Size(min=8, max=128, message="Confirm Password must be between 8 and 128 characters")
	private String confirm;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "users_projects", 
            joinColumns = @JoinColumn(name = "user_id"), 
            inverseJoinColumns = @JoinColumn(name = "project_id")
        )
    private List<Project> joined;
	
	@OneToMany(mappedBy="manager", fetch = FetchType.LAZY)
	private List<Project> projects;
	
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<Task> tasks;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;

public User() {}



public User(
		@NotEmpty(message = "Firstname is required!") @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters") String firstName,
		@NotEmpty(message = "Lastname is required!") @Size(min = 3, max = 30, message = "Username must be between 3 and 30 characters") String lastName,
		@NotEmpty(message = "Email is required!") @Email(message = "Please enter a valid email!") String email,
		@NotEmpty(message = "Password is required!") @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters") String password,
		@NotEmpty(message = "Confirm Password is required!") @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters") String confirm,
		List<Project> joined, List<Project> projects) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.confirm = confirm;
	this.joined = joined;
	this.projects = projects;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getConfirm() {
	return confirm;
}



public void setConfirm(String confirm) {
	this.confirm = confirm;
}



public List<Project> getJoined() {
	return joined;
}



public void setJoined(List<Project> joined) {
	this.joined = joined;
}

public List<Project> getProjects() {
	return projects;
}



public void setProjects(List<Project> projects) {
	this.projects = projects;
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
