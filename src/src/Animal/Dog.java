package Animal;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooooof");
	}
	
	@Override
	public String toString() {
		return "Dog [" + super.toString() + "]";
	}

	public static void main(String[] args) {
		Dog dog1 = new Dog("chien de fou");
		dog1.greets();
		dog1.greets(dog1);;
		

	}

}
