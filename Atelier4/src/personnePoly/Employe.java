package personnePoly;

public class Employe extends Personne {
	
	protected double salaire;

	public Employe(String n, String p, String adr, String v, int anneN,double s) {
		super(n, p, adr, v, anneN);
		this.salaire=s;
	}
	
	public void afficher() {
		System.out.println("le nom: "+nom+" le prenom:  "+prenom+" l'adresse: "+adresse+" la ville est "+ville+" date naissance: "+anneNaissance+" et le salaire "+salaire);
		
	}

}
