
public class EmployeCommission extends Employe{
	float salaire_base;
	float ventes;
	int pourcentage;
	public EmployeCommission(String n,float s,float v,int p) {
		super(n,s + p * v);
		this.pourcentage =  p;
		this.salaire_base = s;
		this.ventes = v;
	}
	
	public float calculer() {
		super.salaire_mensuel = this.salaire_base + this.pourcentage * this.ventes;
		return super.salaire_mensuel;
	}
}
