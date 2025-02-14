package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13;
	
	private double braquet; 
	private double diamRoue;
	private Random genAlea = new Random();
	
	public double getBraquet() {
		return braquet;
	}
	public static double getDEFAUT_BRAQUET() {
		return(DEFAUT_BRAQUET); 
	}
	public static void setDefaut_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET; 
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	} 
	public Velo (double braquet, double diamRoue)
	{
		this.braquet = braquet;
		this.diamRoue = diamRoue; 
	}
	public Velo (double braquet)
	{
		this.braquet = braquet;
	}
	public Velo () {
		this.braquet = DEFAUT_BRAQUET;
	}
	
	@Override
	public String toString() {
		return("Velo [ braquet = " + braquet + ", diamRoue = " + diamRoue +"]");
	}
	public double getPuissance(double FrequenceCoupsDePedale) {
		return (FrequenceCoupsDePedale * braquet * diamRoue *genAlea.nextDouble());
	}



public static void main(String[] args) {
	
		Velo v1 = new Velo();
		System.out.println(v1);
		Velo v2 = new Velo(18);
		System.out.println(v2);
        Velo v3 = new Velo(15, 26);
        
        System.out.println("Braquet: " + v3.getBraquet());
        v3.setBraquet(DEFAUT_BRAQUET);
        System.out.println("Braquet: " + v3.getBraquet());
        v3.setDiamRoue(70);
        v3.setBraquet(54);
        
        
        System.out.println("Braquet: " + v3.getBraquet());
        System.out.println("Diamètre de la roue: " + v3.getDiamRoue()) ;
        
        
 		
        System.out.println("Puissance calculée: " + v3.getPuissance(90));
    }
}
