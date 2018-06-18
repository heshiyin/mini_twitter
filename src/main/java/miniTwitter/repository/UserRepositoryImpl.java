package miniTwitter.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import miniTwitter.repository.*;
import miniTwitter.domain.User;
import miniTwitter.model.UserMapper;



@Repository
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	private DataSource dataSource;

	public void setDataSource(DataSource ds) {
	        dataSource = ds;
	}
	
	public User getUserById(int userId) {
		String query = "SELECT * FROM user WHERE ID = ?";
		JdbcTemplate select = new JdbcTemplate(dataSource);
		User user = (User) select.queryForObject(
			    query, new Object[] { userId }, new UserMapper());
		
		return user;
	}
}
