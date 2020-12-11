package personnePoly;

public class Chef extends Employe{
	
	protected String service;

	public Chef(String n, String p, String adr, String v, int anneN, double s,String service) {
		super(n, p, adr, v, anneN, s);
		this.service=service;
	}
	
	public void afficher() {
		System.out.println("le nom: "+nom+" le prenom:  "+prenom+" l'adresse: "+adresse+" la ville est "+ville+" date naissance: "+anneNaissance+" et le salaire "+salaire+" service"+service);
		
	}

}
