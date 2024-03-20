package com.masai.entity;

import java.util.Set;

public class Owner extends Person {

	private int ownerId;
	private Person carOwner;
	private String dirvingLicence;
	private Set<Car> cars;
	
	
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public Person getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(Person carOwner) {
		this.carOwner = carOwner;
	}
	public String getDirvingLicence() {
		return dirvingLicence;
	}
	public void setDirvingLicence(String dirvingLicence) {
		this.dirvingLicence = dirvingLicence;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	
}
