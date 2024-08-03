
public class EmployeHoraire extends Employe{
	float taux_horaire;
	int nb_heur;
	public EmployeHoraire(String nom,float t,int n) {
		super(nom,t*n);
		this.taux_horaire = t;
		this.nb_heur = n;
	}
	
	public float calculer() {
		super.salaire_mensuel = this.taux_horaire * this.nb_heur;
		return super.salaire_mensuel;
	}
}
