
public class TestAccount2 {

	public static void main(String[] args) {
		  Account2 myObj = new Account2();
	        myObj.setNom("Karimi Khalid");

	        Account2 myObje = new Account2();
	        myObje.setAdresse(" Safi ");

	        Account2 myObjec = new Account2();
	        myObjec.setSolde( 14765.8 );
	        
	        System.out.println(myObj.getNom() +" habite � " + myObje.getAdresse()+" - infos solde "+myObjec.getSolde());
	        myObjec.retirer(150000 );

	}



}
