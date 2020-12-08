
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

	public static void main(String[] args) {
	   
		Account client1=new Account();
		client1.nom="alami Hassan";
		client1.Adresse="Safi";
		client1.sold=14765.80;
		client1. afficherInfosSolde();
		
		Account client2=new Account();
		client2.nom="karim khalid";
		client2.Adresse="casablanca";
		client2.sold=7645;
		client2. afficherInfosSolde();
		
	}

}
