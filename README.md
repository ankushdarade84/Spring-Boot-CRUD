Use this Url for test this CRUD Operations
 
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

Get by all
![image](https://github.com/ankushdarade84/Spring-Boot-CRUD/assets/82811718/ff43e082-2a9a-4d42-9469-95ec2a0378af)

Get by IMI Id
![image](https://github.com/ankushdarade84/Spring-Boot-CRUD/assets/82811718/009700df-cea6-4ed9-8299-292a72c6ad80)

post the record
![image](https://github.com/ankushdarade84/Spring-Boot-CRUD/assets/82811718/370b264e-0a18-49fb-9e5c-9962f70fa9a1)

