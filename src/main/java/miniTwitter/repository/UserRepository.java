package miniTwitter.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import miniTwitter.domain.User;

public interface UserRepository {
	User getUserById(int userId);
}
