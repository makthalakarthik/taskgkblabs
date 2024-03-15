package com.taskgkb.taskgkb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.taskgkb.taskgkb.dto.UserDto;
import com.taskgkb.taskgkb.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("/registration")
	public String registration() {

		return "registration";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute("userDto") UserDto userDto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "registration";
		}

		 service.saveUser(userDto);
		return "redirect:/success"; // Redirect to a success page
	}

	@GetMapping("/success")
	public String showSuccessPage() {
		return "success";
	}

	@GetMapping("/getuserdetails")
	public String getUserDetailsPage(Model model) {
		List<UserDto> users = service.getdetails();
		System.out.println(users.size());
		users.add(new UserDto());
		model.addAttribute("users", users);
		model.addAttribute("test", "Karthik");
		return "getuserdetails";
	}
}
