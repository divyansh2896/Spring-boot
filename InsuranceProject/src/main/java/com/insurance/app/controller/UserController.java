package com.insurance.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.app.model.User;
import com.insurance.app.service.UserService;

@RestController
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	UserService service;

	@GetMapping
	public List<User> getUsers() {
		System.out.println(this.getClass().getSimpleName() + " - Get all users service is invoked.");
		return service.getUsers();
	}

	@GetMapping(value = "/{user_id}")
	public User getUserById(@PathVariable int user_id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Get user details by id is invoked.");

		Optional<User> user = service.getUserById(user_id);
		if (!user.isPresent())
			throw new Exception("Could not find user with id- " + user_id);

		return user.get();
	}

	// @RequestMapping(value = "/user/add", /* consumes="application/json", */
	// method = RequestMethod.POST)
	@PostMapping
	public User createUser(@RequestBody User newuser) {
		System.out.println(this.getClass().getSimpleName() + " - Create new user method is invoked.");

		return service.addNewUser(newuser);
	}

	@PutMapping(value = "/{user_id}")
	// @RequestMapping(value = "/user/update/{user_id}", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User updateuser, @PathVariable int user_id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Update user details by id is invoked.");

		Optional<User> user = service.getUserById(user_id);
		
		/**
		if (!user.isPresent())
			throw new Exception("Could not find user with id- " + user_id);

		/*
		 * IMPORTANT - To prevent the overriding of the existing value of the variables
		 * in the database, if that variable is not coming in the @RequestBody
		 * annotation object.
		 *
		if (updateuser.getPassword() == null)// || updateuser.getPassword().isEmpty()
			updateuser.setPassword(user.get().getPassword());
		if (updateuser.getCity() == null) // || updateuser.getCity().isEmpty()
			updateuser.setCity(user.get().getCity());
		if (updateuser.getState() == null)
			updateuser.setState(user.get().getState());
		if (updateuser.getAddress() == null)
			updateuser.setAddress(user.get().getAddress());
		if (updateuser.getMob_no() == 0)
			updateuser.setMob_no(user.get().getMob_no());
		   
		// Required for the "where" clause in the sql query template.
		*/
		
		updateuser.setUser_id(user_id);
		return service.updateUser(updateuser);
	}

	@DeleteMapping(value="/{user_id}")
	//@RequestMapping(value = "/user/delete/{user_id}", method = RequestMethod.DELETE)
	public void deleteUserById(@PathVariable int user_id) throws Exception {
		System.out.println(this.getClass().getSimpleName() + " - Delete user by id is invoked.");

		Optional<User> user = service.getUserById(user_id);
		if (!user.isPresent())
			throw new Exception("Could not find user with id- " + user_id);

		service.deleteUserById(user_id);
	}

	/**
	 * @RequestMapping(value= "/employee/deleteall", method= RequestMethod.DELETE)
	 *                        public void deleteAll() {
	 *                        System.out.println(this.getClass().getSimpleName() + "
	 *                        - Delete all employees is invoked.");
	 *                        service.deleteAllEmployees(); } }
	 */

}
