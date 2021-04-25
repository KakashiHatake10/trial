package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TakeRide_Controller {

	@GetMapping("/takeride")
	public String takeride_page() {
		return "takeride";	
	}
		
}
