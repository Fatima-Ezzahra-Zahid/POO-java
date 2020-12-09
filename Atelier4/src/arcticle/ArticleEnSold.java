package arcticle;

public class ArticleEnSold extends Article {
	
	int PourcantageRemise;

	public ArticleEnSold(String n, double prix,int PourcantageRemise) {
		super(n, prix);
		this.PourcantageRemise=PourcantageRemise;
	}
	
	public double prixApreRemise() {
		double MontantRemise=getPrix()*PourcantageRemise/100;
		double prixApresRemise=getPrix()-MontantRemise;
		return prixApresRemise;
	}
	

	
	@Override
	public void afficher() {
		System.out.println("le prix Aprés remise "+prixApreRemise()+" DH");
	}

      

}
