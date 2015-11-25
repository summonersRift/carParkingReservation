package com.parking.Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.parking.common.BaseDao;
import com.parking.Model.DAO.Contract.UserDao;
import com.parking.Model.Domain.AbstractUser;
import com.parking.Model.Domain.NullUser;
import com.parking.Model.Domain.User;
import com.parking.Model.Domain.Role;

@Repository
public class UserDaoImp extends BaseDao implements UserDao {
	
	private static String GET_USER_BY_USERNAME  = "SELECT u.username, u.user_id, u.password, r.role_name " 
												 +"FROM users u, Roles r " 
												 +"WHERE  username=? AND u.role_id=r.role_id";
	
	private static String GET_USER_BY_ID  = "SELECT *"
			+ "FROM users"
			+ "WHERE  username = ?";
	
	private static String VALIDATE_USER  = "SELECT u.username, u.user_id, u.password, r.role_name " 
			 +"FROM users u, Roles r " 
			 +"WHERE  username=? AND u.role_id=r.role_id AND u.password=?";
	
	private static String INSERT_USER = "INSERT INTO users (username, password, email, balance, role_id) "+
										"VALUES (?, ?, ?, 0, 1)";
	
	@Override
	public AbstractUser getbyId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractUser getbyName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AbstractUser signIn(String userName, String password) {
		// TODO Auto-generated method stub

		User user = new User();
		try {
			
			PreparedStatement statement = getConnection().prepareStatement(VALIDATE_USER);
			statement.setString(1, userName);
			statement.setString(2, password);



			ResultSet result = statement.executeQuery();
			
			if (!result.isBeforeFirst() ) {    
				return new NullUser();
			} 
			
			while (result.next()) {
				user.setUserName(result.getString("u.username"));
				user.setUserid(result.getLong("u.user_id"));
				user.setPassword(result.getString("u.password"));
				Role role = new Role();
				role.setRoleType(result.getString("r.role_name"));
				user.setUserRole(role);
			
			}
			
			result.close();
			statement.close();
			
		} catch (SQLException e) {
			// TODO need to add log4j output
			e.printStackTrace();

		} catch (Exception ex) {
			// TODO need to add log4j output
			ex.printStackTrace();

		}
		
		return user;
		//return User.getMyDemoUser();
	}

	@Override
	public AbstractUser addUser(User user) {
		try {
			
			PreparedStatement statement = getConnection().prepareStatement(VALIDATE_USER);
			statement.setString(1, user.getUserName());
			statement.setString(2, user.getPassword());
			statement.setString(2, user.getPassword());

			ResultSet result = statement.executeQuery();			
			result.close();
			statement.close();
			
		} catch (SQLException e) {
			// TODO need to add log4j output
			e.printStackTrace();
			return new NullUser();

		} catch (Exception ex) {
			// TODO need to add log4j output
			ex.printStackTrace();

		}
		return user;		
	}

}
