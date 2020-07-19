package tutorials;
//singleton class is the class that can have only 1 object
public class Singleton_Dog extends Animal{
	private static Singleton_Dog dog;
	private String name;
	private String Breed;
	private Singleton_Dog(int wt, String name, String breed) {
		super(wt);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.Breed = breed;
		
	}
	
	public static Singleton_Dog getInstance() {
		if (dog == null) {
			dog = new Singleton_Dog(20, "Mona", "German Shepherd");
			return dog;
		}
		return dog;
	}
	
	public void aboutDog() {
		System.out.println("I'm dog and my name is {"+this.name+"} and my weight is {"+super.wt+"}"); //wt is protect variable so accessible
	}
	public void bark() {
		System.out.println(this.name+" is Barking ....");
	}
	
	//equals() is method inherited from Object class and can be custom implemented
	public boolean equals(Singleton_Dog d) {
		if (this.name.equals(d.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Singleton_Dog d = getInstance();
		d.bark();
		d.aboutDog();
		Singleton_Dog d2 = d;
		//print object
		System.out.println("Print Object: "+d); //memory address of the object
		System.out.println("Print Object: "+d.toString());
		
		System.out.println(d2.equals(d));
		System.out.println(d.hashCode()); //number representation of object
	}
	
}
