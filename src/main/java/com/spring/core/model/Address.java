package com.spring.core.model;

public class Address {
	private int doorNum;
	private String city;

	public Address() {
		super();
	}

	public Address(int doorNum, String city) {
		super();
		this.doorNum = doorNum;
		this.city = city;
	}

	public int getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [doorNum=" + doorNum + ", city=" + city + "]";
	}

}
