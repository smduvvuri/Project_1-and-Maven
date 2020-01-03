package com.deloitte.telecom.dao;
import java.util.*;

import com.deloitte.telecom.entities.Mobile;
import com.deloitte.telecom.exceptions.MobileNotFoundException;

public class MobileDaoImpl implements IMobileDao {
	private Map<String, Mobile> store=new HashMap<String, Mobile>();
	 @Override
	 public Map<String, Mobile> getStore()
	 {
		return store; 
	 }
	 @Override
	    public void addMobile(Mobile w) {
	     store.put(w.getMobileNo(), w);
	    }

	    @Override
	    public Mobile findBymobno(String mobileno) {
	        Mobile w = store.get(mobileno);
	        if (w == null) {
	            throw new MobileNotFoundException("Account not found for mobile no=" +mobileno);
	        }
	        return w;
	    }

	    @Override
	    public Set<Mobile> allMobiles() {
	        Collection<Mobile> mobiles = store.values();
	        Set<Mobile> MobileSet = new HashSet<>(mobiles);
	        return MobileSet;
	    }

		@Override
		public Mobile rechargeAmount(String str1, String name, double amount) {
			System.out.println("Enter the recharge amount:");
			Scanner t=new Scanner(System.in);
			double rechamt=t.nextDouble();
			double newbal=rechamt+amount;
			Mobile w9 = new Mobile(str1,name,newbal);
			double loft=w9.getBalance();
			System.out.println(w9.getName());
			System.out.println(w9.getMobileNo());
			System.out.println("New Balance="+loft);
			Mobile y=store.put(str1, w9 );
			return y;
		}
}

