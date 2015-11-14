package com.parking.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.UserService;
import com.parking.common.LoginRequest;
import com.parking.common.PasswordResetDTO;
import com.parking.common.UserRequest;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService service) {

		userService = service;

	}

	@RequestMapping(value = "/AccountMgtPage", method = RequestMethod.GET)
	public ModelAndView getAccountPage(Model model) {
		return new ModelAndView("UserManagement");
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

	@RequestMapping(value = "/getUserById/{userId}", method = RequestMethod.GET)
	public @ResponseBody User getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> signIn(LoginRequest login,
			HttpServletRequest request, HttpServletResponse response) {

		if (login == null || !login.validate()) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		// TODO:get User info from user service
		User user = userService
				.signIn(login.getUserName(), login.getPassword());

		if (user == null || user.isNull()) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		if (request != null) {

			HttpSession session = request.getSession();
			if (session != null) {
				session.setAttribute("user", user);
			} else {

				return new ResponseEntity<String>(
						HttpStatus.INTERNAL_SERVER_ERROR);
			}

		}

		return new ResponseEntity<String>(user.getJson().toString(),
				HttpStatus.OK);

	}

	@RequestMapping(value = "/signout", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> signOut(
			@RequestParam(value = "userName") String userName,
			HttpServletRequest request) {

		ResponseEntity<String> response = new ResponseEntity<String>(
				HttpStatus.OK);

		HttpSession session = request.getSession();
		if (session == null) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

		User newUser = (User) session.getAttribute("user");

		if (newUser != null && newUser.getUserName().equals(userName)) {

			session.setAttribute("user", "");
			session.invalidate();
		} else {

			response = new ResponseEntity<String>(
					HttpStatus.INTERNAL_SERVER_ERROR);

		}

		return response;
	}

	@RequestMapping(value = "/sidebar", method = RequestMethod.GET)
	public ModelAndView getSideBar(Model model) {
		return new ModelAndView("sidebar");
	}

}
