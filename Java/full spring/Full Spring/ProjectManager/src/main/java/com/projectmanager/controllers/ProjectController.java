package com.projectmanager.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.projectmanager.models.Project;
import com.projectmanager.models.Task;
import com.projectmanager.models.User;
import com.projectmanager.services.ProjectSerivce;
import com.projectmanager.services.TaskService;
import com.projectmanager.services.UserService;

@Controller
public class ProjectController {
@Autowired
ProjectSerivce projectService;
@Autowired
UserService userService;
@Autowired
TaskService taskService;

@GetMapping("/dashborad")
public String dashborad(Model model,HttpSession session) {
	Long id = (Long) session.getAttribute("user_id");
	User thisUser = userService.findUser(id);
	List<Project> notJoined= projectService.notJoined(thisUser);
	List<Project> areJoined= projectService.areJoined(thisUser);
	model.addAttribute("thisUser",thisUser);
	model.addAttribute("notJoined",notJoined);
	model.addAttribute("areJoined",areJoined);
	return "home.jsp";
}

@GetMapping("/projects/new")
public String showCreateProjectPage(@ModelAttribute("project") Project project ) {
	return "create.jsp";
}

@PostMapping("/projects/new")
public String createProject(@Valid @ModelAttribute("project") Project project, BindingResult result,HttpSession session ) {
	if (result.hasErrors()) {
        return "create.jsp";
    } else {
    	Long id = (Long) session.getAttribute("user_id");
    	User thisUser = userService.findUser(id);
    	projectService.createProject(thisUser,project);
    	return"redirect:/dashborad";
    }


}

@GetMapping("/join/{proid}")
public String join(@PathVariable Long proid ,HttpSession session) {
	Project thisProject = projectService.findProject(proid);
	Long id = (Long) session.getAttribute("user_id");
	User thisUser = userService.findUser(id);
	projectService.joinProject(thisUser ,thisProject);
	return "redirect:/dashborad";
	
}

@GetMapping("/leave/{proid}")
public String leave(@PathVariable Long proid ,HttpSession session) {
	Project thisProject = projectService.findProject(proid);
	Long id = (Long) session.getAttribute("user_id");
	User thisUser = userService.findUser(id);
	projectService.leaveProject(thisUser ,thisProject);
	return "redirect:/dashborad";
	
}

@GetMapping("/projects/edit/{proId}")
public String editPage(@PathVariable("proId") Long proId, Model model ) {
	Project project = projectService.findProject(proId);
	model.addAttribute("project",project);
	return "edit.jsp";
}

@PutMapping("/projects/edit/{proId}")
public String editProject(Model model, @PathVariable("proId") Long proId, @Valid @ModelAttribute("project") Project project, BindingResult result) {
	if (result.hasErrors()) {
        return "edit.jsp";
    } else {
    	projectService.updateProject(project, proId);
        return "redirect:/dashborad";
}
}

@GetMapping("/projects/{proId}")
public String projectDetailsPage(@PathVariable("proId") Long proId, Model model, HttpSession session) {
	Long id = (Long) session.getAttribute("user_id");
	User thisUser = userService.findUser(id);
	Project project = projectService.findProject(proId);
	boolean isJoined =projectService.isExist(thisUser,project);
	model.addAttribute("project",project);
	model.addAttribute("thisUser",thisUser);
	model.addAttribute("isJoined",isJoined);
	return "show.jsp";
	
}

@GetMapping ("/projects/{proId}/tasks")
public String displayTaskPage(@PathVariable("proId") Long proId, Model model,@ModelAttribute("task") Task task) {
	Project project = projectService.findProject(proId);
	List<Task> tasks=project.getTasks();
	model.addAttribute("project",project);
	model.addAttribute("tasks",tasks);
	return "task.jsp";
}

@PostMapping("/projects/{proId}/tasks")
public String addTask(Model model, @PathVariable("proId") Long proId, @Valid @ModelAttribute("task") Task task, BindingResult result, HttpSession session) {
	if (result.hasErrors()) {
        return "task.jsp";
    } else {
    	Long id = (Long) session.getAttribute("user_id");
    	User thisUser = userService.findUser(id);
    	Project project = projectService.findProject(proId);
    	taskService.createTask( task,  project, thisUser);
    	
        return "redirect:/projects/"+proId+"/tasks";
}
}

@DeleteMapping("/delete/{proId}")
public String deleteProject(@PathVariable("proId") Long proId) {
	projectService.deleteProject(proId);
	return "redirect:/dashborad";
}
@GetMapping("/logout")
public String logout(HttpServletRequest request){
    HttpSession httpSession = request.getSession();
    httpSession.invalidate();
    return "redirect:/";
}

}
