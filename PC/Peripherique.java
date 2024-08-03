
public abstract class Peripherique {
	int id;
	String modele;
	Peripherique(int id,String modele){
		this.id = id;
		this.modele = modele;
	}
	abstract public double calculerPuissance();
}
