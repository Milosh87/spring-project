package rs.engineering.javagroup.spring_project.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import rs.engineering.javagroup.spring_project.dto.User;

@Component
public class UserRepo {

	private List<User> list;

	public UserRepo() {
		super();
		list = new ArrayList<User>();
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}
	
	
}
