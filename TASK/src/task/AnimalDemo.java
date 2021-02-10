package task;

class Animal 
{
	void characterstics()
	{
		System.out.println("Animal's   ....");
	}	
}
class Dog extends Animal
{
	void characterstics()
	{
		System.out.println("Dog  ....");
	}
}
class Cat extends Animal
{
	void characterstics()
	{
		System.out.println("Cats ...");
	}
}
class Horse extends Animal
{
	void characterstics()
	{
		System.out.println("Horse...");
	}
}

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an;
		an=new Dog();
		an.characterstics();
		an=new Cat();
		an.characterstics();
		an=new Horse();
		an.characterstics();
		
		
		
		
		
		
		

	}

}
