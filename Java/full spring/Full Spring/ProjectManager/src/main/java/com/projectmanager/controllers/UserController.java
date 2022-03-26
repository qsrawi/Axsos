package com.projectmanager.controllers;



import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.projectmanager.models.LoginUser;
import com.projectmanager.models.User;
import com.projectmanager.services.UserService;

@Controller
public class UserController {
@Autowired
private UserService userService;

@GetMapping("/")
public String index(Model model) {
model.addAttribute("newUser", new User());
model.addAttribute("newLogin", new LoginUser());
return "index.jsp";
}

@PostMapping("/register")
public String register(@Valid @ModelAttribute("newUser") User newUser,
BindingResult result, Model model, HttpSession session) {
userService.register(newUser, result);
if(result.hasErrors()) {
model.addAttribute("newLogin", new LoginUser());
return "index.jsp";
}
session.setAttribute("user_id", newUser.getId());
return "redirect:/dashborad";
}

@PostMapping("/login")
public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin,
BindingResult result, Model model, HttpSession session) {
User user = userService.login(newLogin, result);
if(result.hasErrors()) {
model.addAttribute("newUser", new User());
return "index.jsp";
}
session.setAttribute("user_id", user.getId());
return "redirect:/dashborad";
}


}