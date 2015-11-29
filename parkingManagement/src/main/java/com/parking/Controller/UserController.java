package com.parking.Controller;

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

import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.NullUser;
import com.parking.Model.Domain.RequestUser;
import com.parking.Model.Domain.Role;
import com.parking.Model.Domain.User;
import com.parking.Model.Services.Contract.UserService;
import com.parking.common.LoginRequest;

@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService service) {

		userService = service;

	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> addUser(  RequestUser requser) {

		if (requser == null || requser.getUserName() == null) {// This also
																// validate
			// the client side
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		User user = new User();
		user.setUserName(requser.getUserName());
		user.setEmail(requser.getEmail());
		user.setPassword(requser.getPassword());
		user.setFirstName(requser.getFirstName());
		user.setLastName(requser.getLastName());
		user.set_securityQuestion(requser.getSecQuestionOne());
		user.setSecurityAnswer(requser.getSecAnswersOne());
		user.setUserIdentification(requser.getUserIdentifation());
		Role role = new Role();
		role.setRoleType("user");
		user.setUserRole(role);

		AbstractUser usr = userService.addUser(user);

		if (usr instanceof NullUser) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>(((User) user).getJson().toString(),
				HttpStatus.OK);
	}

	@RequestMapping(value = "/getbalance/{userId}", method = RequestMethod.GET)
	public @ResponseBody String getUserById1(@PathVariable("userId") Long userId) {

		return userService.getUserBalance(userId).toString();
	}

	/**
	 * @param login
	 * @param request
	 * @param response
	 * @return ResponseEntity<String> 
	 */
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<String> signIn(LoginRequest login,
			HttpServletRequest request, HttpServletResponse response) {

		if (login == null || !login.validate()) {
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		// TODO:get User info from user service
		AbstractUser user = userService.signIn(login.getUserName(),
				login.getPassword());

		if (user instanceof NullUser) {
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

		return new ResponseEntity<String>(((User) user).getJson().toString(),
				HttpStatus.OK);

	}

	/**
	 * @param userName
	 * @param request
	 * @return ResponseEntity<String>
	 */
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

	/**
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/sidebar", method = RequestMethod.GET)
	public ModelAndView getSideBar(Model model) {
		return new ModelAndView("sidebar");
	}

}
