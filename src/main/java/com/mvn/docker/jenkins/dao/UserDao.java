package com.mvn.docker.jenkins.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.mvn.docker.jenkins.model.User;
@Repository
public class UserDao {
	private List<User> users = new ArrayList<User>();
	public List<User> getAllUsers(){
		User user = new User();
		user.setUserId(UUID.randomUUID().toString());
		user.setUserName(String.valueOf(new Random().nextInt(100000)));
		user.setPassword(String.valueOf(new Random().nextInt(300000)));
		users.add(user);
		return users;
	}
	
}
