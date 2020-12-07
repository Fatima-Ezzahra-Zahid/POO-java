
public class Account2 {

	
    private String nom;
    private String adresse;
    private double solde;

    public String getNom() {
        return nom;
    }

     public void setNom(String nom) {
            this.nom = nom;
          }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
      }

    public double getSolde() {
        return solde;
    }

     public void setSolde(double solde) {
            this.solde= solde;
          }
   public double retirer(double m) {  //ex6
	   
	   if(m<=solde)
	       System.out.println("solde retirer est "+" "+m);
	   else
		   System.out.println("vous ne pouvez pas retirer");   
	 
	   return m;
	 
   }

}
