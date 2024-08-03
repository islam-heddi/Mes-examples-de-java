
public class TestRectangle {
	public static void main(String[] args) {
		Point p1 = new Point(12,20);
		Point p3 = new Point(12,20);
		Point p2 = new Point(12,20);

		Rectangle r1 = new Rectangle(p1);
		Rectangle r2 = new Rectangle(p2);
		Rectangle r3 = new Rectangle(p3);
		System.out.println("largeur : " + r1.largeur());
		System.out.println("longeur : " + r1.longeur());
		System.out.println("surface : " + r1.surface());
		System.out.println("nbr : " + r1.nbr);
	}
}
