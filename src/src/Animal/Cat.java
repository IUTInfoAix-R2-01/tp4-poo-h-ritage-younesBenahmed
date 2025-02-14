package Animal;

public class Cat extends Mammal{

	public Cat( String name) {
		super(name); 
	}
	
	public void greets() {
		System.out.println("meow");
	}
	
	@Override
	public String toString() {
		return "Cat [=" + super.toString() + "]";
	}

	public static void main(String[] args) {
Cat cat1 = new Cat("chatounou"); 
System.out.println(cat1);
		

	}

}
