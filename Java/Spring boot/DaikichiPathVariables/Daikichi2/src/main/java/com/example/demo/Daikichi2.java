package com.example.demo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/daikichi")

public class Daikichi2 {
	@RequestMapping("/{travel}/{city}")
	public String holliday (@PathVariable("travel") String travel,
							@PathVariable("city") String city) {
		return ("Congratulations! You will soon " + travel + " to " + city);
		
	}
	@RequestMapping("/{travel}/{city}/{number}")
	public String withNumber (@PathVariable("travel") String travel,
							@PathVariable("city") String city,
							@PathVariable("number") int number)	{
		if(number%2==0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		else {
			return  "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		
		
	}
}



