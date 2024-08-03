
public class Bibliotheque {
	Document[] doc;
	int count;
	Bibliotheque(int n){
		doc = new Document[n];
	}
	
	public void ajouter(Document d) {
		doc[count] = d;
		count++;
	}
	
	public void afficher() {
		for(int i = 0 ; i < count ; i++) {
			doc[i].affiche();
		}
	}
}
