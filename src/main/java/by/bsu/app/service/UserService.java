package by.bsu.app.service;

import by.bsu.app.model.User;

public interface UserService {

	void save(User user);

    User findByUsername(String username);
	
}
