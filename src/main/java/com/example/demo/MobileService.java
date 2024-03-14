package com.example.demo;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class MobileService {
	Mobile m1=new Mobile("vivo1234","Vivo","T1",20000);
	Mobile m2=new Mobile("samsung1234","Samsung","A20",11000);
	Mobile m3=new Mobile("redmi1234","Mi","T1",15000);
	
	List <Mobile> mlist=new ArrayList<Mobile>(Arrays.asList(m1,m2,m3));
	
	public List <Mobile> getMobiles()
	{
		return mlist;
	}
	
	public Mobile getMobile(String imeiNo)
	{
		Mobile m= null;
		for(Mobile mobile:mlist)
		{
			if(mobile.getImeiNo().equals(imeiNo))
			{
				m1=mobile;
			}
		}
		return m1;
	}
	
	public void addMobile(Mobile m1)
	{
		mlist.add(m1);
	}
	
	public List<Mobile> deleteMobile(String imeiNo)
	{
		for(Mobile mob:mlist)
		{
			if(mob.getImeiNo().equals(imeiNo))
			{
				mlist.remove(mob);
			}
		}
		return mlist;
	}
	
	public List<Mobile> updateMobile(String oldimeiNo,Mobile m)
	{
		for(Mobile mm:mlist)
		{
			if(m.getImeiNo().equals(oldimeiNo))
			{
				mm.setCompName(m.getCompName());
				mm.setModelName(m.getModelName());
				mm.setPrice(mm.getPrice());
			}
		}
		return mlist;
	}
}