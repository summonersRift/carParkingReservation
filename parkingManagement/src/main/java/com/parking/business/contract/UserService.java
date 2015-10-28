package com.parking.business.contract;

import java.util.List;

import com.parking.common.PasswordResetDTO;
import com.parking.common.UserRequest;
import com.parking.domain.User;

public interface UserService {

	User getUserById(Long userId);

	boolean enabledDisabledUser(long userId, String flag);

	void editUser(UserRequest editInfo);

	void passwordReset(PasswordResetDTO passwordReset);

	boolean disableUser(long userId);

	boolean enableUser(long userId);

	void addUser(User user);

	void updateUser(User user);

	void deleteUserById(Long id);

	User getUserByUserName(String userName);

	List<User> getAll();

	User signIn(String userName, String password);

	User adminSignIn(String userName, String password);

}
