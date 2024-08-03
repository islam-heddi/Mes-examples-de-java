
public class Point {
	private float x;
	private float y;
	
	public Point(float x,float y) {
		this.x = x;
		this.y = y;
	}
	
	public void ajoute(float x,float y) {
		this.x += x;
		this.y += y;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public float getx() {
		return this.x;
	}
	
	public void setx(float x) {
		this.x = x;
	}
	
	public float gety() {
		return this.y;
	}
	
	public void sety(float y) {
		this.y = y;
	}
}
