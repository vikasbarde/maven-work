package com.mvn.docker.jenkins.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvn.docker.jenkins.dao.UserDao;
import com.mvn.docker.jenkins.model.User;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	public List<User> getAllUsers(){
		return userDao.getAllUsers();
	}
}
