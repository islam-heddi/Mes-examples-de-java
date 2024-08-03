
@SuppressWarnings("serial")
public class ConsoException extends Exception{
	double cons;
	ConsoException(double c){
		this.cons = c;
		ConsomationException();
	}
	public void ConsomationException() {
		System.out.println("ERROR : La consommation dépasse 1000 !!");
	}
}
