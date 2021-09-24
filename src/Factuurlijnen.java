import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factuurlijnen {
    // factuur
    // product
    // aantal
    Klant klant;
    Date datumBetaald;
    Factuur f;
    public Factuurlijnen(Klant klant, Date datumBetaald, Factuur f){
        this.klant=klant;
        this.datumBetaald=datumBetaald;
        this.f=f;
    }
    public void printFactuur(ArrayList<Product> productMandje, List<Integer> hoeveelheidProducten){
        f.setVolgnummer();

        System.out.println("Naam en voornaam klant:" + klant.getKlantVolledigeNaam());
        System.out.println("Factuurnummer: " + f.getVolgnummer());
        System.out.println("Factuurdatum: "+ f.datumFactuur());
        System.out.println("Datum betaald:" + f.datumFactuur());
        System.out.println("===================================================================");
        // Hier komen de factuurlijnen

        for (int i = 0; i<productMandje.size(); i++){
            System.out.println(productMandje.get(i) + " \t " + hoeveelheidProducten.get(i) + " \t " + this.klant.getGekozenMaten().get(i));
        }
        System.out.println("===================================================================");
    }

}
