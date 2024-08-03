
public class Dessin {
	Rectangle[] r;
	int counter = 0;
	
	public Dessin(int taille){
		r = new Rectangle[taille];
	}
	
	public void ajoute(Rectangle r1) {
		if(counter >= r.length) {
			System.out.println("You passed the rectangles limit ! ");
			return;
		}
		r[counter] = r1;
		counter++;
	}
	
	public float somme() {
		float sum = 0;
		for(int i = 0 ; i < counter ; i++) {
			sum += r[i].surface();
		}
		return sum;
	}

}
