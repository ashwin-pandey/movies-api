package com.videostraming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.videostraming.bean.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "FROM User")
	List<User> getAllUsers();

}
