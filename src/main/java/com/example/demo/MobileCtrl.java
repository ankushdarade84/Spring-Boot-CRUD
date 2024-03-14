package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileCtrl {
	@Autowired
	MobileService mobileService;
	
	@RequestMapping(method=RequestMethod.GET, value="/mobile")
	public List <Mobile> getMobiles()
	{
		return mobileService.getMobiles();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/mobile/{imeiNo}")
	public Mobile getMobile(@PathVariable String imeiNo)
	{
		return mobileService.getMobile(imeiNo);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/mobile")
	public void addMobile(@RequestBody Mobile m1)
	{
		mobileService.addMobile(m1);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/mobile/{imeiNo}")
	public List<Mobile> deleteMobile(@PathVariable String imeiNo)
	{
		return mobileService.deleteMobile(imeiNo);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/mobile/{oldimeiNo}")
	public List<Mobile> updateMobile(@PathVariable String oldimeiNo,@RequestBody Mobile m)
	{
		return mobileService.updateMobile(oldimeiNo, m);
	}
}
