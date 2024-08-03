
public class Test {

	public static void main(String[] args) {
		UC u = new UC("core2quad",2.98,2,200);
		
		u.affiche();
		
		Moniteur m = new Moniteur(1,"testing",1700,18,2);
		
		m.affiche();
		
		Clavier kb = new Clavier(12,"avira",105,102.2);
	
		kb.affiche();
		
		PC pc0 = new PC(u,kb,m);
		
		try {
			double consommation = pc0.calConsoElec(2);
			System.out.println("La consommation éléctrique est " + consommation);
		}catch(ConsoException e) {
			//error
			System.out.println("La consommation est trés haut plus d'un " + e.cons);
		}
	}

}
