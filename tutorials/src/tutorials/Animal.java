package tutorials;

public class Animal extends Object implements Creature//every class inherits from Object class - implicitly
{
	protected int wt; //protected visible to the self class and the child classes
	
	Animal(int wt){
		this.wt = wt;
	}
	
	public void eat(String food) {
		System.out.println("Eating...."+food);
	}
	
	public void walk() {
		System.out.println("Walking ...");
	}
	//compareTo() is method inherited from Object class and can be custom implemented
	public int compareTo(Animal a) {
		// TODO Auto-generated method stub
		return this.wt - a.wt;
	}

	
}

/*Object class methods to each implemented class
 * 1.)hashCode()
 * 2.)toString()
 * 3.)compareTo()
 * 4.)equals()
*/
