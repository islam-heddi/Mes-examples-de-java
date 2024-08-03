
public class TestBibliotheque {
	public static void main(String[] args) {
		Bibliotheque b1 = new Bibliotheque(5);
		Document d1 = new Document("My tastes");
		b1.ajouter(d1);
		Internet i1 = new Internet("Cup","www.wikipedoa.com");
		Livre l1 = new Livre("The bulp secrets","French edition","word TEAM");
		Livre l2 = new Livre("My life","Britsh house","HARRY TROMAN");
		Internet i2 = new Internet("Transistors","www.startimes.com");
		b1.ajouter(i2);
		b1.ajouter(i1);
		b1.ajouter(l1);
		b1.ajouter(l2);
		b1.afficher();
	}
}
