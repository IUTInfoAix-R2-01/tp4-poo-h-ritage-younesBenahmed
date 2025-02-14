package animalEx6;

public class Cat extends animalEx6 {
public Cat( String name) {
	super(name);
}
public void greets() {
	System.out.println("meow");
}
public static void main(String[] ta) {
	Cat cat1 = new Cat("chatou");
	cat1.greets();
}
}
