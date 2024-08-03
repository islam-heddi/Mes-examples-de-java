package animaux;

public class Exam {

	public static void main(String[] args) {
		Animal animal =new Canard();
		if(animal instanceof Canard){
			animal.parle();
			animal= new Poule();
		}
		if(animal instanceof Poule){
			((Dindon)animal).speak();
			animal= new Animal();
		}
		if(animal instanceof Animal){
			System.out.println("terminé");
		}
	}

}
