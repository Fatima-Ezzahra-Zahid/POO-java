package biblioth�que;

/*est caract�ris� par son num�ro d�identit� (entier),
 *  son nom (String), le num�ro de son abonnement (entier) 
 *  et l�ouvrage pris de la biblioth�que (un abonn� peut prendre � la fois un seul ouvrage).
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
