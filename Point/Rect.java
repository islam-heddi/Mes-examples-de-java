
public class Rect {
	Point x1;
	Point x2;
	Point y1;
	Point y2;
	static int nbr = 0;
	public Rect(Point x1,Point x2,Point y1,Point y2) {
		if(this.x1 == null) nbr++;
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void BR() {
		x2.show();
	}
	
	public void TL() {
		y1.show();
	}
	
	public void A() {
		x1.show();
	}
	
	public void B() {
		y2.show();
	}
	
	public float longeur() {
		return x2.getx() - x1.getx();
	}
	
	public float width() {
		return y1.getx() - x1.getx();
	}
	
	public float surface() {
		return width() * longeur();
	}
	
	public float largeur() {
		return 2 * ( width() + longeur() );
	}
}
