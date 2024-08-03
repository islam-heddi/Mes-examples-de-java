
public class Entreprise {
	private Employe[] empo;
	static int count = 0;
	public Entreprise(int max) {
		empo = new Employe[max];
	}

	public void ajouter(Employe e) {
		if(count < empo.length) {
			this.empo[count] = e;
			count++;
		}else {
			System.out.println("Erreur les emplois sont passés la limite .");
		}
	}
	
	public float moyenne() {
		float sum = 0;
		for(int i = 0 ; i < count ; i++) {
			sum = sum + empo[i].calculer();
		}
		return sum / count;
	}
}
