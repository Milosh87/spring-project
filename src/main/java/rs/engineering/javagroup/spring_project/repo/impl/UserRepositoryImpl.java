package rs.engineering.javagroup.spring_project.repo.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import rs.engineering.javagroup.spring_project.dto.User;
import rs.engineering.javagroup.spring_project.repo.UserRepository;

@Component
public class UserRepositoryImpl implements UserRepository {

	private JdbcTemplate jdbcTemplate;
	@Autowired
	public UserRepositoryImpl (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	@Override
	public void save(User user) {

		jdbcTemplate.update("INSERT INTO user (firstname,lastname,username,password) " + "VALUES(?,?,?,?)",
				user.getFirstname(),
				user.getLastname(),
				user.getUsername(),
				user.getPassword());
		
	}


	@Override
	public List<User> getAll() {
		String query = "SELECT * FROM user";
		return jdbcTemplate.query(query, new UserMapper());
		
	}
	
	class UserMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			User user = new User();
			user.setId(rs.getLong("id"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		}
		
	}

	@Override
	public User findById(Long id) {
		String query = "SELECT * FROM user WHERE id = ?";
		return jdbcTemplate.queryForObject(query,new Object[] {id}, (ResultSet rs, int rowNumber)-> {
			User user = new User();
			user.setId(rs.getLong("id"));
			user.setFirstname(rs.getString("firstname"));
			user.setLastname(rs.getString("lastname"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			return user;
		});
	
	
}
}
