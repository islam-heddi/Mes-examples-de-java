
public class Livre extends Document{
	String editeur;
	String auteur;
	public Livre(String t,String e,String a) {
		super(t);
		this.editeur = e;
		this.auteur = a;
	}
	
	public void affiche() {
		System.out.println("titre : " + this.titre);
		System.out.println("éditeur : " + this.editeur);
		System.out.println("auteur : " + this.auteur);
		System.out.println("----------Un livre---------");
		
	}
}
