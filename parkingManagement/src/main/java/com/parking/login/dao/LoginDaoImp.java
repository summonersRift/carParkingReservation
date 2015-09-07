package com.parking.login.dao;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.parking.common.BaseDao;
import com.parking.domain.Role;
import com.parking.domain.User;
import com.parking.login.LoginRequest;
import com.parking.login.service.LoginService;

@Repository
public class LoginDaoImp extends BaseDao implements LoginDao {
	
	public LoginDaoImp(){}
	
	//@SuppressWarnings("unused")
	//private final DataSource dataSource;

   // @Autowired
   // public LoginDaoImp(DataSource dataSource) {
   //     this.dataSource = dataSource;
   // }

//	private static String GET_USER_SESSION = "SELECT u.user_name, u.user_password, "
//			+ "u.user_id, c.code_number, r.enabled, r.role_type, r.role_desc "
//			+ "FROM VirtualQueue.VenueRegisteredUser u, VirtualQueue.Code c, VirtualQueue.UserRole ur, "
//			+ "VirtualQueue.Role r  WHERE  u.code_id = c.code_id AND u.user_id = ur.user_id "
//			+ "AND r.role_id = ur.role_id AND u.user_name = ? AND u.user_password = ? "
//			+ "AND  c.code_number= ?";
//	
//	private static String GET_ADMIN_SESSION = "SELECT u.user_name, u.user_password, u.user_id, r.enabled, r.role_type, r.role_desc "
//			+ "FROM VirtualQueue.VenueRegisteredUser u, VirtualQueue.UserRole ur, VirtualQueue.Role r  "
//			+ "WHERE  u.user_id = ur.user_id AND r.role_id = ur.role_id AND u.user_name = ? "
//			+ "AND u.user_password = ? AND r.role_type = 'ADMIN' ";

	@Override
	public boolean signOut(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Long validLogin(String user, String password) {
		// TODO Auto-generated method stub
		return 24L;
	}

	@Override
	public User signIn(String userName, String password) {

		User user = new User();
		
		user.setEmail("test@test.com");
		user.setPassword("test");
		user.setUserName("test@test.com");
		
//		try {

//			PreparedStatement statement = getConnection().prepareStatement(
//					GET_USER_SESSION);
//			statement.setString(1, userName);
//			statement.setString(2, password);
//			statement.setString(3, code);
//
//			ResultSet result = statement.executeQuery();
//			while (result.next()) {
//				user.setUserName(result.getString("user_name"));
//				user.setUserid(result.getLong("user_id"));
//				user.setPassword(result.getString("user_password"));
//				Role role = new Role();
//				role.setRoleType(result.getString("role_type"));
//				role.setRoleDesc(result.getString("role_desc"));
//				user.setUserRole(role);
//			
//			}
//			
//			result.close();			
//			statement.close();
//			
//		} catch (SQLException e) {
//			// TODO need to add log4j output
//			e.printStackTrace();
//
//		} catch (Exception ex) {
//
//			// TODO need to add log4j output
//			ex.printStackTrace();
//
//		}
//		 
//
		return User.getDemoUser();

	}

	@Override
	public User adminSignIn(String userName, String password) {
		
		User user = new User();
		user.setEmail("admin@admin.com");
		user.setPassword("admin");
		user.setUserName("admin@admin.com");
		
//		try {
//
//			PreparedStatement statement = getConnection().prepareStatement(
//					GET_ADMIN_SESSION);
//			statement.setString(1, userName);
//			statement.setString(2, password);
//			
//
//			ResultSet result = statement.executeQuery();
//			while (result.next()) {
//				user.setUserName(result.getString("user_name"));
//				user.setUserid(result.getLong("user_id"));
//				user.setPassword(result.getString("user_password"));
//				Role role = new Role();
//				role.setRoleType(result.getString("role_type"));
//				role.setRoleDesc(result.getString("role_desc"));
//				user.setUserRole(role);
//			
//			}
//			
//			result.close();
//			
//			statement.close();
//		} catch (SQLException e) {
//			// TODO need to add log4j output
//			e.printStackTrace();
//
//		} catch (Exception ex) {
//
//			// TODO need to add log4j output
//			ex.printStackTrace();
//
//		}
		 

		return User.getDemoUser();

	}

}
