package Animal;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	
	
public static void main (String[] toto) {
	Animal animal = new Animal("lolo");
	System.out.println(animal);
}
}
