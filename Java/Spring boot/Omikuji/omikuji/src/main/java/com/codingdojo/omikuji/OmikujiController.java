package com.codingdojo.omikuji;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

	@RequestMapping("/Omikuji")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping(value="/show", method=RequestMethod.POST)
	public String show( HttpSession session,
						@RequestParam(value="myNumber") String myNumber,
					    @RequestParam(value="city") String city,
					    @RequestParam(value="person") String person,
						@RequestParam(value="hoppy") String hoppy,
						@RequestParam(value="living") String living,
						@RequestParam(value="desc") String desc)
	{
		session.setAttribute("myNumber", myNumber);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hoppy", hoppy);
		session.setAttribute("living", living);
		session.setAttribute("desc", desc);
	    return "redirect:/Omikuji/welcome";
	}
	
	@RequestMapping("/Omikuji/welcome")
	public String welcome(HttpSession session ,Model model) {
		
		model.addAttribute("myNumber",session.getAttribute("myNumber"));
		model.addAttribute("city",session.getAttribute("city"));
		model.addAttribute("person",session.getAttribute("person"));
		model.addAttribute("hoppy",session.getAttribute("hoppy"));
		model.addAttribute("living",session.getAttribute("living"));
		model.addAttribute("desc",session.getAttribute("desc"));

		return "welcom.jsp";
	}
	}