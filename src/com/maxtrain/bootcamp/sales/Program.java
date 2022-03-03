package com.maxtrain.bootcamp.sales;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var c1 = new Customer();
		c1.log();
		var c2 = new Customer("ACME MFG");
		c2.log();
		var c3 = new Customer ("MAX", "Cincinnati", "OH");
		c3.log();
		
		//creates an instance of 
		var db = new CustomerDB();
		try {
			
		db.add(c1);
		db.add(c2);
		db.add(c3);
		
		var customers = db.getAllCustomers();
		for(var c : customers) {
			c.log();
		}
		//get an instance of a customer retrieved from the list in db
		//var max = db.getByPk(3);
		//max.setCity("Mason");
		//max.log();
		// this is the same thing as above
		//db.get(1).log();
				
		} catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
