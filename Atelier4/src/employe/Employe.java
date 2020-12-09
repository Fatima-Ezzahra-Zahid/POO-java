package employe;

import java.util.Calendar;

public class Employe {

	String nom;
	String prenom;
	String adresse;
	int anneNaissance;
	Calendar calendar = Calendar.getInstance();
	int anneEncour=calendar.get(Calendar.YEAR);
	int age;
	
	public Employe(String n,String p,String adr,int anneN) {
		this.nom=n;
		this.prenom=p;
		this.adresse=adr;
		this.anneNaissance=anneN;
	}
	
	public int calculerAge() {
		age=anneEncour-anneNaissance;
		return age;
	}
	
	public void afficherInfosClient() {
		System.out.println(nom+" né le "+anneNaissance+" habitant à "+adresse+" age "+calculerAge());
	}
	
}
