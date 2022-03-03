package com.maxtrain.bootcamp.sales;

public class Customer {
	
	private static int nextId = 1;

	private int id;
	private String name;
	private String city;
	private String stateCode;
	private boolean active;
	private double sales;
	
	//Constructor (default with no customer name)No parameters at all
	public Customer() { // used to initialize an instance of customer
		this("New Customer"); 
	}
	//Constructors - if no city and state - one parameter (name)
	// defaults with Mason and OH
	public Customer(String name) {
		this(name, "Mason", "OH");
	}
	//Constructor that passes three parameters 
	public Customer(String name, String city, String stateCode) {		
		this.setId(nextId++); // or do it up here
		//nextId; //increments the customer from the static id
		this.setName(name);
		this.setCity(city);
		this.setStateCode(stateCode);
		this.setActive(true);
		this.setSales(0);
	}
	
	public String toString() {
		return this.getId() + "|" + this.getName() + "|" + this.getCity()
		+ "|" + this.getStateCode() + "|" + this.isActive()+ "|" + this.getSales();
		
	}
	public void log() {
		System.out.println(this);
	}
	
	
	
	
	public int getId() {
		return id;
	}	
	private void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public double getSales() {
		return sales;
	}
	private void setSales(double sales) {
		this.sales = sales;
	}
	
}
