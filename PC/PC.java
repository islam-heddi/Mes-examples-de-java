
public class PC {
	UC uniteCentral;
	Clavier clavier;
	Moniteur ecran;
	
	public PC(UC u,Clavier c,Moniteur m) {
		this.uniteCentral = u;
		this.clavier = c;
		this.ecran = m;
	}
	
	public double calConsoElec(int duree) throws ConsoException {
		double consommation = duree * (this.clavier.calculerPuissance() + this.ecran.calculerPuissance() + this.uniteCentral.puissance); 
		if(consommation > 1000) throw new ConsoException(consommation);
		return consommation;
	}
	
	public void affiche() {
		this.uniteCentral.affiche();
		this.clavier.affiche();
		this.ecran.affiche();
	}
}
