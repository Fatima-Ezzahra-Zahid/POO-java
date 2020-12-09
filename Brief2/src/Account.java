
public class Account {
	String nom;
	String Adresse;
	double sold;

	
	
	
	public  double  calculerInterer(double tauxInteret) {  //ex4 
		
		double SoldInteret=sold*tauxInteret/100;
		return SoldInteret;
		
	}
	
	public void  afficherInfosSolde () {
		System.out.println(nom+" habite à "+Adresse+" - infos solde "+sold+" DH"+" et intérêts "+calculerInterer(7));
	}



}
