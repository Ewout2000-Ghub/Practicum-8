package Pract8;

import java.time.LocalDate;

public class Computer implements Goed {

    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productiejaar;

    public Computer(String tp, String adr, double pr, int jr) {
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productiejaar = jr;
    }

    public double huidigeWaarde() {
        return aanschafPrijs * (Math.pow(0.60, LocalDate.now().getYear() - productiejaar));
    }

    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Computer) {
            Computer andereComputer = (Computer) obj;

            if (this.type.equals(andereComputer.type) && this.productiejaar == andereComputer.productiejaar) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }

    public String toString() {
        return "Computer: " + type + " met bouwjaar " + productiejaar + " heeft een waarde van: " + Utils.euroBedrag(huidigeWaarde());
    }
}
