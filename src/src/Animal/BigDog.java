package Animal;

public class BigDog extends Dog{
	
	public BigDog(String name) {
		super(name);
	}
	public void greets() {
		System.out.println("Woow");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooooooow");
	}
	
	public void greets(BigDog another) {
		System.out.println("Woooooooooooooow");
	}
	
	public static void main(String[] args) {
		BigDog bigdog1 = new BigDog("chien de fou");
		bigdog1.greets();
		Dog dog1 = new Dog("chien de nul");
		bigdog1.greets(dog1);

	}
}
