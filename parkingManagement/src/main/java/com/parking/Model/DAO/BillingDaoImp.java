package com.parking.Model.DAO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.DAO.Contract.BillingDao;
import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.User;

@Repository
public class BillingDaoImp implements BillingDao{

	@Override
	public List<BillingInfo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BillingInfo getBillingInfoByUsr(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUserFunds(User user, BigDecimal funds) {
		// TODO Auto-generated method stub
		return null;
	}

	 
 

	

}
