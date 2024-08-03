
public class Clavier extends Peripherique{
	int NbTouches;
	final double puissance;
	public Clavier(int id,String modele,int nbtouche,double puissance){
		super(id,modele);
		this.NbTouches = nbtouche;
		this.puissance = puissance;
	}
	public double calculerPuissance() {
		return puissance;
	}
	public void affiche() {
		System.out.println("Nombre de touche : " + this.NbTouches);
		System.out.println("La puissance : " + this.puissance);
	}
}
