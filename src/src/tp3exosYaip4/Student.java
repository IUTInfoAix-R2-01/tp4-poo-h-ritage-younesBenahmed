package tp3exosYaip4 ;

public class Student extends Person {
	
	
	private int year;
	private double fee;
	private String program;
	
	public Student (String name, String address, String program, int year, double fee) {
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override 
	public String toString() {
		return ("Student[Person[name " + super.getName() + ", address="+ super.getAddress()+"]program="+ getProgram() +",year="+ getYear() +",fee="+getFee() +"]");
	}
	public static void main( String[] args) {
		Student student1 = new Student("Albert", "5 rue des cocelicots", "ecole des bo arts", 2 , 2 );
		System.out.println(student1);
		
		student1.getAddress();
		student1.getFee();
		student1.setFee(741.2);
		student1.setAddress("iut aix");
		System.out.println(student1);
		
	}
}