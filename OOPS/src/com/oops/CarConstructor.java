package com.oops;


	
class Car{
	String model;
	String brand;
	int seatCapacity;
	String enginetype;

	
	public Car(String model,String brand,int seatCapacity,String enginetype) {
		this. model=model;
		this. brand=brand;
		this.seatCapacity=seatCapacity;
		this. enginetype=enginetype;
	}
	void displayCarDetails()
	{
		System.out.println("model  : "+model);
		System.out.println("brand :"+brand);
		System.out.println("seatCapacity :"+seatCapacity);
		System.out.println("type :"+enginetype);
	}
}
	public class CarConstructor   
	{
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
			Car c= new Car("sport","hyudai",5,"car");
		    c.displayCarDetails();
			Car c2= new Car("sport","mercedez",1,"car");
			Car c3= new Car("sport","audi",7,"car");
			c2.displayCarDetails();
			c3.displayCarDetails();
		}
	
}