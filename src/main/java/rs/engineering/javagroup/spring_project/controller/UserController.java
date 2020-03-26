package rs.engineering.javagroup.spring_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import rs.engineering.javagroup.spring_project.dto.User;

import rs.engineering.javagroup.spring_project.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ModelAndView allUsers() {
		ModelAndView modelAndView = new ModelAndView("user/users");

		modelAndView.addObject("list", userService.getAll());

		return modelAndView;

	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute(name = "user") User user) {
		if (!userService.getAll().contains(user)) {
			userService.save(user);
		}
		ModelAndView modelAndView = new ModelAndView("redirect:/user/add");
		return modelAndView;

	}

	@ModelAttribute(name = "user")
	public User user() {
		return new User("n/a", "n/a", "n/a", "n/a");
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView add() {
		ModelAndView modelAndView = new ModelAndView("user/add");
		modelAndView.addObject("action", "Action: add new user");
		return modelAndView;

	}

	@RequestMapping(value = "/userId", method = RequestMethod.GET)
	public ModelAndView userId(@RequestParam(name = "id") Long id) {
		User user = userService.findById(id);
		ModelAndView modelAndView = new ModelAndView("user/userId");
		modelAndView.addObject("userid", user);
		return modelAndView;
	}

}
