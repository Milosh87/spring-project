package rs.engineering.javagroup.spring_project.repo;

import java.util.List;

import rs.engineering.javagroup.spring_project.dto.User;



public interface UserRepository {
	void save(User user);
	List<User> getAll();
	User findById(Long id);
	
}
