package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Login_User;

@Controller
public class HomeController {

	Login_User user = new Login_User();
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("dfd"+user);
		model.addAttribute("user", user);
		return "home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {	
		model.addAttribute("user", user);
		return "Login";
	}

	@PostMapping("/logins")
	public String logins(@ModelAttribute("user") Login_User user) {
		System.out.println(user);
		return "home";
	}
}
