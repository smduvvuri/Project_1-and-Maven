package com.deloitte.telecom.service;
import java.util.Set;
import com.deloitte.telecom.dao.*;
import com.deloitte.telecom.entities.*;
import com.deloitte.telecom.exceptions.*;
import com.deloitte.telecom.service.*;

public class MobileServiceImpl implements IMobileService {
	private IMobileDao dao;
	@Override
	public IMobileDao getDao()
	{
		return dao;
	}
	
    public MobileServiceImpl(IMobileDao dao) {
		this.dao = dao;
	}

@Override
	public void addMobile(Mobile w) {
    dao.addMobile(w);
	}

	@Override
    public Mobile findBymobno(String mobileno){
        if (mobileno==null||mobileno.length()!=10 ) {
            throw new IncorrectNumberException("Number is incorrect");
        }
        Mobile w = dao.findBymobno(mobileno);
        return w;
    }

	@Override
	public Set<Mobile> allMobiles() {
		Set<Mobile> mobiles = dao.allMobiles();
		return mobiles;
	}

	@Override
	public Mobile rechargeAmount(String str1, String name, double amount) {
		Mobile r=dao.rechargeAmount(str1,name, amount);
		return r;
	}}

