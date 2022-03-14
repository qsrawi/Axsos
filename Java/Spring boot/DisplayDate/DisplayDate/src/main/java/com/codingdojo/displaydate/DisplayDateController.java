package com.codingdojo.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {

  
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date() {
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time() {
		return "time.jsp";
	}
}
