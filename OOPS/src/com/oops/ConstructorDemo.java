package com.oops;


class product
{
	int id;
	int price ;
	String name;
	product()
	{
		System.out.println("this is constructor");
		id=2;
		price=288989;

	}

	void display()
	{
		System.out.println("this is method");
		System.out.println("id"+id);
		System.out.println("price"+price);
		System.out.println("name"+name);
	}
}

	public class ConstructorDemo {

		public static void main(String[] args)
		{
			// TODO Auto-generated method stub

			product laptop= new product();
			laptop.display();
		}
	}
