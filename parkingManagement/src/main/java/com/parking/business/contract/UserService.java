package com.parking.business.contract;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parking.domain.User;
import com.parking.user.dto.PasswordResetDTO;
import com.parking.user.dto.UserRequest;
 
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

}
