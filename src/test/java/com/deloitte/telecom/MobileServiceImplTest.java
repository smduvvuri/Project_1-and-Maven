package com.deloitte.telecom.service;
import java.util.Map;

import org.junit.Test;
import org.junit.Assert;
import org.junit.*;

import com.deloitte.telecom.dao.MobileDaoImpl;
import com.deloitte.telecom.entities.Mobile;


public class MobileServiceImplTest {
	@Test
	public void testCreateAccount_1()
	{
		MobileServiceImpl service=new MobileServiceImpl(new MobileDaoImpl());
		String mobno="9491651719";
		double balance=700;
		String name="Ram";
		//String accountType="prepaid";
		Mobile m1=new Mobile(mobno,name,balance);
		//service.addMobile(m1);
		//double resultBalance=mobile.getBalance();
		//Assert.assertEquals(balance, resultBalance,0);
		//Assert.assertEquals(name, mobile.getName());
		Map<String, Mobile> store=service.getDao().getStore();
		//Mobile expected=store.get(mobno);
		store.put(mobno,m1);	 
		//Assert.assertNotNull(expected);
		//Assert.assertEquals(expected, m1);
		//System.out.println("Done");
		Mobile fetched1=service.findBymobno(mobno);
		//String name1=fetched1.getName();
		Assert.assertEquals(m1, fetched1);
		//Mobile f3=service.rechargeAmount(mobno, name, balance);
		//double balnew=f3.getBalance();
		//double balnew2=balance+balnew;
		//Assert.assertEquals(balnew,balance,0);
		
	}

}
