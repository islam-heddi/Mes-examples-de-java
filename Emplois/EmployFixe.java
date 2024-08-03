
public class EmployFixe extends Employe{
	float salaire;
	public EmployFixe(String n,float s) {
		super(n,s);
		this.salaire = s;
	}
	public float calculer() {
		return super.salaire_mensuel;
	}
}
