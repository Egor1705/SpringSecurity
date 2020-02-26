package by.bsu.app.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import by.bsu.app.dao.RoleDao;
import by.bsu.app.dao.UserDao;
import by.bsu.app.model.Role;
import by.bsu.app.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

  
	
	
	public void save(User user) {
		 user.setPassword(user.getPassword());
	        Set<Role> roles = new HashSet<>();
	        roles.add(roleDao.getOne(1));
	        user.setRoles(roles);
	        userDao.save(user);
	}

	public User findByUsername(String username) {
	        return userDao.findByUserName(username);
	    }
	}

