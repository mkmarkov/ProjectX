package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.User;
import com.example.demo.UserRepository;

@Controller
@RequestController
public class MainController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	public @ResponseBody String addNewUser (
			@RequestParam String username,
			@RequestParam String password) {
		
		User n = new User();
		n.setUsername(username);
		n.setPassword(password);
		userRepository.save(n);
		return "saved";
		}
	
	@RequestMapping(path="/all", method=RequestMethod.GET)
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	
	

}
