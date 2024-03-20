package com.masai.entity;

import java.io.Serializable;

public class Customer implements Serializable{

	private int customerId;
	private Person carCustomer;
	private String drivingLicence;
	private Car rentCar;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Person getCarCustomer() {
		return carCustomer;
	}
	public void setCarCustomer(Person carCustomer) {
		this.carCustomer = carCustomer;
	}
	public String getDrivingLicence() {
		return drivingLicence;
	}
	public void setDrivingLicence(String drivingLicence) {
		this.drivingLicence = drivingLicence;
	}
	public Car getRentCar() {
		return rentCar;
	}
	public void setRentCar(Car rentCar) {
		this.rentCar = rentCar;
	}
		
}
