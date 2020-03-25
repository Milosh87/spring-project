package rs.engineering.javagroup.spring_project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import rs.engineering.javagroup.spring_project.controller.UserController;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
		"rs.engineering.javagroup.spring_project.repo"
		
})
public class MyWebContextConfig {
	
	
	
	@Bean
	public UserController userController() {
		return new UserController();
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}
