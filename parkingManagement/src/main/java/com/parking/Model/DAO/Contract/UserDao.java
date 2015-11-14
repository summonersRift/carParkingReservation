package com.parking.Model.DAO.Contract;

import com.parking.Model.Domain.User;

public interface UserDao {

	User getbyId(Long userId);

	User signIn(String userName, String password);

}
