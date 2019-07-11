package com.insurance.app.service;

import java.util.List;
import java.util.Optional;

import com.insurance.app.model.User;

public interface UserService {
	Optional<User> getUserById(int user_id);

	List<User> getUsers();

	User addNewUser(User adduser);

	User updateUser(User updateuser);

	void deleteUserById(int user_id);

	// void deleteAllUsers();

}
