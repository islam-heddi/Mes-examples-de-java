
public class TestLivre {
	public static void main(String[] args) {
		Livre l1 = new Livre("La belle vie","UNO 1940","Ahmed Ahmed");
		l1.affiche();
		System.out.println("count : " + l1.nbr);
		Document d1 = new Document("algeriano");
		d1.affiche();
		d1 = l1;
		System.out.println("count : " + l1.nbr);
		d1.affiche();
	}
}
