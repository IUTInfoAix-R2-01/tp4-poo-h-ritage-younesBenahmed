package animalEx6;

public class Dog extends animalEx6  {

	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooooof");
	}
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("chien de fou");
		dog1.greets();
	}
}


