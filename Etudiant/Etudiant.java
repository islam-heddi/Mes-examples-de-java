
public class Etudiant {
	String specialite;
	String nom;
	int matricule;
	
	Etudiant(int m,String n){
		this.matricule = m;
		this.nom = n;
	}
	
	Etudiant(int m,String n,String s){
		this.matricule = m;
		this.nom = n;
		this.specialite = s;
	}
}
