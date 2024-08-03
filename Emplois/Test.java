
public class Test {
	public static void main(String[] args) {
		Employe f = new EmployFixe("Ahmed AHMED",1000);
		Employe c = new EmployeCommission("Brahim",1200,12,13);
		Employe h = new EmployeHoraire("ISLAM ISLAM",12,13);
		Entreprise es = new Entreprise(12);
		es.ajouter(f);
		es.ajouter(c);
		es.ajouter(h);
		System.out.print("Le moyenne de l'entreprise: " + es.moyenne() + "€");
	}
}
