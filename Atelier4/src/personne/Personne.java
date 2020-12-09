package personne;

public class Personne {
	String nom;
	String prenom;
	String adresse;
	String ville;
	int anneNaissance;
	
	public Personne(String n,String p,String adr,String v,int anneN) {
		this.nom=n;
		this.prenom=p;
		this.adresse=adr;
		this.ville=v;
		this.anneNaissance=anneN;
	}
	
	public String toString () {
		return "nom: "+this.nom+" le prenom :"+this.prenom+" adresse :"+this.adresse+" ville:"+this.adresse+" anne de naissance; "+this.anneNaissance;
	}
	
	
	

}
