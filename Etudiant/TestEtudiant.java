public class TestEtudiant{
	public static void main(String[] args) {
		Etudiant etud1 = new Etudiant(299,"Ahmed");
		etud1.specialite="Informatique";
		Etudiant etud2 = new Etudiant(288,"Ali","Math");
		etud2.specialite=etud1.specialite;
		System.out.println(etud1.nom+" "+etud1.specialite);
		System.out.println(etud2.nom+" "+etud2.specialite);
		etud1=etud2;
		etud2.nom="Amel";
		System.out.println(etud1.nom+" "+etud1.specialite);
		System.out.println(etud2.nom+" "+etud2.specialite);
	}
}