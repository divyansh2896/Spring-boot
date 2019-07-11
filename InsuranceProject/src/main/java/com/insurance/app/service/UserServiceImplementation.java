package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.app.dao.InsuranceDao;
import com.insurance.app.model.User;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	InsuranceDao dao;

	public List<User> getUsers() {
		return dao.findAll();
	}

	public Optional<User> getUserById(int user_id) {
		return dao.findById(user_id);
	}

	public User addNewUser(User user) {
		return dao.save(user);
	}

	public User updateUser(User user) {
		return dao.save(user);
	}

	public void deleteUserById(int user_id) {
		dao.deleteById(user_id);
	}

	/**
	 * public void deleteAllUsers(){ dao.deleteAll(); }
	 */
}
