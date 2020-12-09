package banque;

public class CompteEpargne extends Compte {
	int tauxInteret;

	public CompteEpargne(int Nm, double solde,int taux) {
		super(Nm,solde);
		this.tauxInteret=taux;
	}
	
	public double CalculeInteret() {
		double SoldInteret=solde*tauxInteret/100;	
		return SoldInteret;
	}

}
