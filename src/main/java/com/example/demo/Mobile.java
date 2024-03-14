package com.example.demo;

public class Mobile {
	private String imeiNo, compName, modelName;
	private int price;
	
	public Mobile() {
	
	}

	public Mobile(String imeiNo, String compName, String modelName, int price) {
		super();
		this.imeiNo = imeiNo;
		this.compName = compName;
		this.modelName = modelName;
		this.price = price;
	}

	public String getImeiNo() {
		return imeiNo;
	}

	public void setImeiNo(String imeiNo) {
		this.imeiNo = imeiNo;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}