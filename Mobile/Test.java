
public class Test {

	public static void main(String[] args) {
		Mobile a = new Chien();
		a.bouger();
		Gourmand b = new Chien();
		b.manger();
		Creature c = new Chien();
		c.manger();
		Creature d = new Creature();
		d.manger();
	}

}
