
public class Circulation {
	public static void main(String[] args) {
		Automobile a = new Automobile(0, 50);
		Vehicule v = new Velo(0, "VTT");
		Vehicule vh = new Automobile(3, 10);
		Conducteur c = new Conducteur("Karim", "1234567");
		((Velo) v).tombe();
		c.conduit(v);
		c.conduit((Vehicule) a);
		((Automobile) vh).faitLePlein(10);
	}
}	