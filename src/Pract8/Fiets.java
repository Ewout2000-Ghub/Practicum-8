package Pract8;

import java.time.LocalDate;

public class Fiets extends Voertuig {

    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        nieuwprijs = pr;
        bouwjaar = jr;
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        return nieuwprijs * (Math.pow(0.90, LocalDate.now().getYear() - bouwjaar));
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Fiets) {
            Fiets andereFiets = (Fiets) obj;

            if (this.framenummer == andereFiets.framenummer) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }
}
