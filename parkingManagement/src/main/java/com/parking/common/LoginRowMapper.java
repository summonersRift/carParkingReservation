package com.parking.common;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.parking.Model.Domain.Role;
import com.parking.Model.Domain.User;
 
	 
	public class LoginRowMapper implements RowMapper <User>{
		 
		        public User mapRow(ResultSet result, int rowNum) throws SQLException {
		 
		            User user = new User(); 
		           
		        	user.setUserName(result.getString("user_name"));
					user.setUserid(result.getLong("user_id"));
					user.setPassword(result.getString("user_password"));
					Role role = new Role();
					role.setRoleType(result.getString("role_type"));
					role.setRoleDesc(result.getString("role_desc"));
					user.setUserRole(role); 
		            
		            return user;
		 
		        }

}
