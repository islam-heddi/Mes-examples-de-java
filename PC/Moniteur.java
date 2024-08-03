
public class Moniteur extends Peripherique{
	int resolutionMax;
	int dimension;
	int classe;
	public Moniteur(int id,String modele,int r,int d,int c){
		super(id,modele);	
		this.resolutionMax = r;
		this.dimension = d;
		this.classe = c;
	}
	@Override
	public double calculerPuissance() {
		return (this.classe * this.dimension + this.resolutionMax * 0.015);
	}
	
	public void affiche() {
		System.out.println("Resolution maximum : " + this.resolutionMax);
		System.out.println("Dimension : " + this.dimension);
		System.out.println("La classe de la consommation : " + this.classe);
		System.out.println("Puissance : " + this.calculerPuissance());
	}
}
