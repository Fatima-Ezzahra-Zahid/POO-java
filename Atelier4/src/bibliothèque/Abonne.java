package bibliothèque;

/*est caractérisé par son numéro d’identité (entier),
 *  son nom (String), le numéro de son abonnement (entier) 
 *  et l’ouvrage pris de la bibliothèque (un abonné peut prendre à la fois un seul ouvrage).
 */

public class Abonne {

	private int num;
	private String nom;
	private int numAb;
	
	public Abonne(int num,String nom,int numAb) {
		this.num=num;
		this.nom=nom;
		this.numAb=numAb;
	}
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num=num;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	
	public int getNumAb() {
		return numAb;
	}
	
	public void setNumAb(int numAb) {
		this.numAb=numAb;
	}

	
}
