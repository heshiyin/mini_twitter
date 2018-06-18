package miniTwitter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import miniTwitter.domain.User;
import miniTwitter.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;
	
	public User userService(int id) {
		return userRepository.getUserById(id);
	}
}
