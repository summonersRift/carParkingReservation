package com.parking.Model.DAO;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.Model.Domain.BillingDao;
import com.parking.Model.Domain.BillingInfo;
import com.parking.Model.Domain.User;
import com.parking.common.BaseDao;

@Repository
public class BillingDaoImp extends BaseDao implements BillingDao{

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
