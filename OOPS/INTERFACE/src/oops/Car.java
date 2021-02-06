package oops;

public class Car {
	
	int yearModel;
	String make;
	int speed;
	
	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		speed=0;
		
	}

	public int getYearModel() {
		return yearModel;
	}


	public String getMake() {
		return make;
	}

	

	public int getSpeed() {
		return speed;
	}

	void accelerate() {
		speed=speed+5;
		
	}
	void brake()
	{
		speed=speed-5;
		if(speed<0)
		{
			speed=0;
		}
		
	}
	

}
