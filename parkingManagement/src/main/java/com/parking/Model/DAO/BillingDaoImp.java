package com.parking.Model.DAO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.BillingDao;
import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.User;
import com.parking.common.BaseDao;

@Repository
public class BillingDaoImp extends BaseDao implements BillingDao{

	private static String GET_USER_SESSION = "SELECT u.user_name, u.user_password, "
			+ "u.user_id, c.code_number, r.enabled, r.role_type, r.role_desc "
			+ "FROM VirtualQueue.VenueRegisteredUser u, VirtualQueue.Code c, VirtualQueue.UserRole ur, "
			+ "VirtualQueue.Role r  WHERE  u.code_id = c.code_id AND u.user_id = ur.user_id "
			+ "AND r.role_id = ur.role_id AND u.user_name = ? AND u.user_password = ? "
			+ "AND  c.code_number= ?";
	
	private static String GET_ADMIN_SESSION = "SELECT u.user_name, u.user_password, u.user_id, r.enabled, r.role_type, r.role_desc "
			+ "FROM VirtualQueue.VenueRegisteredUser u, VirtualQueue.UserRole ur, VirtualQueue.Role r  "
			+ "WHERE  u.user_id = ur.user_id AND r.role_id = ur.role_id AND u.user_name = ? "
			+ "AND u.user_password = ? AND r.role_type = 'ADMIN' ";
	
	
	@Override
	public List<BillingInfo> getAll() {
		 
		return null;
	
	}

	@Override
	public BillingInfo getBillingInfoByUsr(User user) {
		  
		return null; 
	
	
	}

	@Override
	public Boolean updateUserFunds(User user, BigDecimal funds) {
		 
		
		
		
		return true;
	}

	 
 

	

}
