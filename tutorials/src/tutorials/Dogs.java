package tutorials;

public class Dogs 
{
	private String name;
	private String breed;
	private int age;
	private String color;
	
	public Dogs(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println(this.name +" is barking");
	}
	
}
