package q3;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest
{
	public static void main(String[] args)
	{
		//Dog dog = new Dog("Spike");
		Labrador lab = new Labrador("Dogmeat", "Black");
		Yorkshire york = new Yorkshire("DogNumber2");
		//System.out.println(dog.getName() + " says " + dog.speak());
		System.out.println(lab.getName() + " says " + lab.speak());
		System.out.println("Average Weight:" + lab.avgBreedWeight()+ "lb");
		System.out.println(york.getName() + " says " + york.speak());
		System.out.println("Average Weight:" + york.avgBreedWeight() + "lb");
	}
}