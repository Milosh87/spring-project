package rs.engineering.javagroup.spring_project.service;

import java.util.List;

import rs.engineering.javagroup.spring_project.dto.User;


public interface UserService {
	void save(User user);
	List<User> getAll();
	User findById(Long id);
}
