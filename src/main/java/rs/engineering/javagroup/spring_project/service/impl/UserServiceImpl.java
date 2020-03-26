package rs.engineering.javagroup.spring_project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.engineering.javagroup.spring_project.dto.User;
import rs.engineering.javagroup.spring_project.repo.UserRepository;
import rs.engineering.javagroup.spring_project.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Override
	public void save(User user) {
		userRepository.save(user);

	}
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.getAll();
	}
	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
}
