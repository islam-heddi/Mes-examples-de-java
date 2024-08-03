
public class TestDessin {
	public static void main(String[] args) {
		Dessin des1 = new Dessin(10);
		Rectangle r1 = new Rectangle(20,13);
		Rectangle r2 = new Rectangle(2,1);
		Rectangle r3 = new Rectangle(8,9);
		Rectangle r4 = new Rectangle(98,1);
		Rectangle r5 = new Rectangle(3,54);
		Rectangle r6 = new Rectangle(38,10);
		des1.ajoute(r1);
		des1.ajoute(r6);
		des1.ajoute(r5);
		des1.ajoute(r3);
		des1.ajoute(r2);
		des1.ajoute(r4);
		System.out.println("somme : " + des1.somme());
	}
}
