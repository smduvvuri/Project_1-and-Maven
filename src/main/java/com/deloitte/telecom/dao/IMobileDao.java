package com.deloitte.telecom.dao;
import java.util.Map;
import java.util.Set;

import com.deloitte.telecom.entities.Mobile;


public interface IMobileDao {


	    Mobile findBymobno(String mobileno);

	    Set<Mobile> allMobiles();

		void addMobile(Mobile w);

		Mobile rechargeAmount(String str1, String name, double amount);

		Map<String,Mobile> getStore();

		
	}

