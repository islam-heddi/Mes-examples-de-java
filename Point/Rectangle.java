
public class Rectangle {
	Point p1;
	static int nbr = 0;
	
	public Rectangle(int x,int y) {
		if(this.p1 == null) nbr++;
		this.p1 = new Point(x,y);
	}
	
	public Rectangle(Point p) {
		if(this.p1 == null) nbr++;
		this.p1 = p;
	}
	
	public float longeur() {
		return (this.p1.getx() > this.p1.gety())? this.p1.getx() : this.p1.gety();
	}
	
	public float largeur() {
		return (this.p1.getx() < this.p1.gety())? this.p1.getx() : this.p1.gety();
	}
	
	public float surface() {
		return this.longeur() * this.largeur();
	}
	
}
