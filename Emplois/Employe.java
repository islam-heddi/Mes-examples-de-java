
public abstract class  Employe {
	String nom;
	float salaire_mensuel;
	public Employe(String nom,float s) {
		this.nom = nom;
		this.salaire_mensuel = s;
	}
	public abstract float calculer();
}
