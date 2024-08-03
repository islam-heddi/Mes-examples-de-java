
public class Document {
	String titre;
	static int nbr;
	public Document() {
		if(titre == null)
			nbr++;
		this.titre = "none";
	}
	public Document(String t) {
		if(titre == null)
			nbr++;
		this.titre = t;
	}
	
	public void affiche() {
		System.out.println("le titre : " + this.titre);
		System.out.println("------------Un document seul-----------");
		
	}
}
