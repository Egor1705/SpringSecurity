package by.bsu.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import by.bsu.app.model.Role;

public interface RoleDao extends JpaRepository<Role,Integer> {
	
}
