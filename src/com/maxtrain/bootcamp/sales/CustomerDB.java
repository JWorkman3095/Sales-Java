package com.maxtrain.bootcamp.sales;

public class CustomerDB {
	// an array collection
	private Customer[] customers = new Customer[10];
	private int index = 0;

	// method that will add a cust instance
	public void add(Customer customer) throws Exception {
		// once we have 10 there is no more room
		// check index to see if < 10
		if (index > 9) {
			throw new Exception("Collection is full!");
		}
		// puts in customer at that index number
		customers[index] = customer;
		// increments the index
		index++;
	}
	// utility to return an id 
	private int findIndex(int id) {
		for (var i = 0; i < customers.length; i++) {
			var cust = customers[i];
			if(cust == null) {
				continue;
			}
			if(cust.getId() == id) {
				return i;
			}
		}
		return -1;
	}	
	// delete a customer
	public boolean delete(int id) {
		var index = findIndex(id);
		if(index == -1) {
			return false;
		}
		customers[index] = null;
		return true;
	}
	// return all customer from the collection - a collection of customers
	public Customer[] getAllCustomers() {
		// figures out how large the array is (index)
		var custs = new Customer[index];
		// put customers in the same location in the new array
		for (var i = 0; i < index; i++) {
			// copy into the new array
			custs[i] = customers[i];
		}
		// return the new array
		return custs;
	}
	// find Customer by something in Customer PK in this case
	public Customer getByPk(int id) {
		var index = findIndex(id);
		if (index > -1) {
			return customers[index];
		}
		return null;
	}
	// Instance to read by index
	public Customer get(int index) throws Exception {
		if (index < 0 || index > 9) {
			throw new Exception("Index out of range");
		}
		return customers[index];
	}
}
