public class Test{
	public static void main(String[] args){
		int x=10;
		int y=20;
		String s1="A";
		String s2="B";
		Point p1=new Point(1,2);
		Point p2=new Point(3,4);
		System.out.println("Avant change : "+ x + " " +y+ " " +s1+ " " +s2+ " " +p1.getx()+ " " +p1.gety()+ " " +p2.getx()+ " " +p2.gety());
		change(x,y,s1,s2,p1,p2);
		System.out.println("Apres change : "+ x+ " " +y+ " " +s1+ " " +s2+ " " +p1.getx()+ " " +p1.gety()+ " " +p2.getx()+ " " +p2.gety());
	}
	public static void change(int a, int b, String n, String m, Point p, Point q){
		System.out.println("debut change : "+ a+ " " + b+ " " +n+ " " +m+ " " +p.getx()+ " " +p.gety()+ " " +q.getx()+ " " +q.gety());
		a=30;
		b=40;
		n="C";
		m="D";
		p.setx(10);
		q=new Point(5,6);
		System.out.println("Fin change : "+ a+ " " +b+ " " +n+ " " +m+ " " +p.getx()+ " " +p.gety()+ " " +q.getx()+ " " +q.gety());
	}
}