package tutorials;

public class Dog extends Animal
{
	private String name;
	private String breed;
	private static int DogCounter=0;
	
	Dog(int wt,String name, String breed) //constructor
	{
		super(wt); //parent class constructor
		this.name = name;
		this.breed = breed;
		DogCounter++;
	}
	public void aboutDog() {
		System.out.println(DogCounter+".)"+"I'm dog and my name is {"+this.name+"} and my weight is {"+super.wt+"}"); //wt is protect variable so accessible
	}
	public void bark() {
		System.out.println(this.name+" is Barking ....");
	}
	
	public static  int getDogCounter() {
		return DogCounter;
	}
	
	//equals() is method inherited from Object class and can be custom implemented
	public boolean equals(Dog d) {
		if (this.name.equals(d.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Dog dog = new Dog(30,"Tommy", "Husky");
		
		dog.eat("Roti");
		dog.walk();
		dog.aboutDog();
		dog.bark();
		
		Dog dog1 = new Dog(33,"Sammy", "Husky");
		Dog dog2 = new Dog(30,"Tommy", "Husky");
		Animal dog3 = new Dog(40,"Lesie", "Mastiff");
		
		System.out.println("No. of objects of Dog class :"+getDogCounter());
		
		System.out.println("Print Object: "+dog);
		System.out.println("Equals():"+ dog.equals(dog1));
		System.out.println("Equals():"+ dog.equals(dog2));
		
		System.out.println(dog.compareTo(dog1));
		
		//dog3.bark() is unavailable as dog3 object has Animal reference //IMP!!
		
		((Dog) dog3).bark();
	}


	
}




