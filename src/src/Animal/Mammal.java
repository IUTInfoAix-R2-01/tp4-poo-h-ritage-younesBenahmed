package Animal;

public class Mammal extends Animal{

	public Mammal(String name) {
		super(name);
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Mammal [" + super.toString() + "]";
	}





	public static void main(String[] args) {
		Mammal mammal1 = new Mammal("lolo2");
		System.out.println(mammal1);
		
		

	}

}
