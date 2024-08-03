
public class Internet extends Document{
	String URL;
	Internet(String t,String u){
		super(t);
		this.URL = u;
	}
	public void affiche() {
		System.out.println("le titre : " + this.titre);
		System.out.println("URL : " + this.URL);
		System.out.println("-----------Depuis l'internet-------------");
	}
}
