package arcticle;

public class Article {
	private String nom;
	private double prix;
	
	public double getPrix() {
		return prix;
		
	}
	
	public void SetPrix(double prix) {
		this.prix=prix;
	}
	
	
   public Article(String n,double prix) {
		this.nom=n;
		this.prix=prix;
	}
	
	public void afficher() {
		System.out.println(prix+" DH");
	}


}
