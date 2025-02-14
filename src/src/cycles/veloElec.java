package cycles;

public class veloElec extends Velo {
	
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15;
	private double facteurPuissanceMoteur; 
	
	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public veloElec (double braquet, double DiamRoue, double CoupleMoteur) {
		super(braquet, DiamRoue);
		this.facteurPuissanceMoteur= CoupleMoteur; 
	}

	public veloElec (double DiamRoue, double CoupleMoteur) {
		super(DiamRoue);
		this.facteurPuissanceMoteur = CoupleMoteur ; 
	}
	
	public veloElec () {
		super();
		this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR ; 
	}
	

	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	@Override
	public String toString() {
	return ("Velo Elec [facteurPuissanceMoteur =" + facteurPuissanceMoteur + "]");
}

	public double getPuissance(double FrequenceCoupsDePedale) {
		return(super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur); 
	}

	

	
	
	
	
	
	
	
	public static void main(String[] args) {
        veloElec velo1 = new veloElec(); 
        veloElec velo2 = new veloElec(52.0, 27.5, 20.0); 
        veloElec velo3 = new veloElec(26.0, 18.0);

        System.out.println("Vélo 1 : " + velo1);
        System.out.println("Vélo 2 : " + velo2);
        System.out.println("Vélo 3 : " + velo3);


        System.out.println("Facteur Puissance Vélo 1 avant modification : " + velo1.getFacteurPuissanceMoteur());
        velo1.setFacteurPuissanceMoteur(25.0);
        System.out.println("Facteur Puissance Vélo 1 après modification : " + velo1.getFacteurPuissanceMoteur());

 
        double frequence = 80.0; 
        System.out.println("Puissance du Vélo 1 avec fréquence " + frequence + " : " + velo1.getPuissance(frequence));
        System.out.println("Puissance du Vélo 2 avec fréquence " + frequence + " : " + velo2.getPuissance(frequence));
        System.out.println("Puissance du Vélo 3 avec fréquence " + frequence + " : " + velo3.getPuissance(frequence));

    }
}










	