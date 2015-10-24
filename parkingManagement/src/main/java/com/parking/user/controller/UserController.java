package com.parking.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.parking.domain.common.User;
import com.parking.user.dto.PasswordResetDTO;
import com.parking.user.dto.UserRequest;
import com.parking.user.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	public UserController() {
	}

	public UserController(UserService service) {

		userService = service;

	}

	@RequestMapping(value = "/userList.json", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return userService.getAll();
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public @ResponseBody void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

	@RequestMapping(value = "/removeUser/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void removeUser(@PathVariable("id") Long id) {
		userService.deleteUserById(id);
	}

	@RequestMapping(value = "/getUserByUserName/{uName}", method = RequestMethod.GET)
	public @ResponseBody User getUserByUserName(
			@PathVariable("uName") String userName) {
		return userService.getUserByUserName(userName);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public Boolean savePerson(User user) {

		try {

			userService.addUser(user);

		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

		return true;
	}

	@RequestMapping(value = "/resetPassword", method = RequestMethod.POST)
	@ResponseBody
	public Boolean resetPassword(PasswordResetDTO passwordReset) {

		try {

			userService.passwordReset(passwordReset);

		} catch (Exception e) {

			e.printStackTrace();

			return false;

		}
		return true;

	}

	@RequestMapping(value = "/editUser", method = RequestMethod.POST)
	@ResponseBody
	public Boolean editUser(UserRequest editInfo) {

		try {

			userService.editUser(editInfo);

		} catch (Exception e) {

			e.printStackTrace();

			return false;

		}
		return true;

	}

	@RequestMapping(value = "/getUserById/{userId}", method = RequestMethod.GET)
	public @ResponseBody User getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}

	@RequestMapping(value = "/enable/{userId}", method = RequestMethod.GET)
	public @ResponseBody boolean enableUser(@PathVariable("userId") long userId) {
		return userService.enableUser(userId);
	}

	@RequestMapping(value = "/disable/{userId}", method = RequestMethod.GET)
	public @ResponseBody boolean disabledUser(
			@PathVariable("userId") long userId) {
		return userService.disableUser(userId);
	}
}
