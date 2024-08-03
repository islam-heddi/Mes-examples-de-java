
public class TestDocument {
	public static void main(String[] args) {
		Document d1 = new Document("The jungle");
		Document d2 = new Document("No Talk");
		Document d3 = new Document();
		d1.affiche();
		d2.affiche();
		d3.affiche();
		System.out.println("i = " + d1.nbr);
	}
}
