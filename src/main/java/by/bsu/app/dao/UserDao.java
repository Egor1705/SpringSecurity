package by.bsu.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import by.bsu.app.model.User;

public interface UserDao extends JpaRepository<User,Integer> {
User findByUserName(String username);
}
