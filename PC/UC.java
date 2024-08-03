
public class UC {
	String CPU;
	double frequence;
	double ram;
	double puissance;
	public UC(String c,double f,double r,double p) {
		this.CPU = c;
		this.frequence = f;
		this.ram = r;
		this.puissance = p;
	}
	
	public void affiche() {
		System.out.println("CPU : "+ this.CPU);
		System.out.println("CPU frequence : "+ this.frequence);
		System.out.println("ram : "+ this.ram);
		System.out.println("Puissance : "+ this.puissance);
	}
}
