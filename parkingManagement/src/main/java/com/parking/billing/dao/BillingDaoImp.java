package com.parking.billing.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.parking.billing.domain.BillingInfo;
import com.parking.domain.common.User;

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
