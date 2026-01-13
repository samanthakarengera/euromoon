import persoon.Conducteur;
import persoon.Steward;
import reis.Reis;
import trein.Class373;
import trein.Trein;
import trein.Class374;
import trein.Locomotief;
import trein.Trein;
import trein.Wagon;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Steward s = new Steward(
                "Jan", "Jansens", "XXX-XXX-XXXX", "jan@mail.com", LocalDate.of(2004,10,05)
        );
        s.voegCertificatieToe("EHBO");
        s.voegCertificatieToe("Veiligheid");
        System.out.println(s.getVoornaam());
        System.out.println(s.getCertificaties());

        Locomotief loco = new Class373();
        Trein trein = new Trein(loco);

        Wagon w1 = new Wagon(40);
        Wagon w2 = new Wagon(40);

        trein.extraWagon(w1);
        trein.extraWagon(w2);

        System.out.println("Max Wagons Class373: " + loco.getMaxWagons());
        System.out.println("Totale capaciteit: " + loco.getCapaciteit());
        //maak reis
        Reis reis = new Reis("Brussel","Antwerpen", LocalDateTime.of(2026,02,05,12,30));
        //maak trein
        Trein t = new Trein(new Class373());
        reis.setTrein(trein);
        //voeg personeel
        reis.voegPersoneel(new Conducteur("Jan","Jan","XXX","janzdjde@mail.com",LocalDate.of(2004,10,05)));
        reis.voegPersoneel(new Conducteur("An","Jan","XXX","janzbhjdjde@mail.com",LocalDate.of(2004,10,05)));
        reis.voegPersoneel(new Conducteur("Bart","Jan","XXX","javghnzdjde@mail.com",LocalDate.of(2004,10,05)));

        System.out.println("Voldoende personeel? "+ reis.heeftGenoegPersoneel());
    }
}