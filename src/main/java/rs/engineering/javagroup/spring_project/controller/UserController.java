package rs.engineering.javagroup.spring_project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Init;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import rs.engineering.javagroup.spring_project.dto.User;
import rs.engineering.javagroup.spring_project.repo.UserRepo;



@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping(value ="/users",method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("list", userRepo.getList());
		
		return "user/users";
		
	}
	
	
	
	
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute(name = "user") User user) {
		if(!userRepo.getList().contains(user)) {
			userRepo.getList().add(user);
		}
		System.out.println(userRepo.getList());
	
		return "redirect:/user/addModel";
	}
	@ModelAttribute(name = "user")
	public User user() {
		return new User("n/a", "n/a","n/a", "n/a");
	}

	@RequestMapping(value ="/addModel", method = RequestMethod.GET)
	public String addModel(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("action", "Action: add new user");
	
		return "user/addModel";
	}
	
	
	
	
	
	
}
