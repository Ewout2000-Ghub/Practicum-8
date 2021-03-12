package Pract8;

import java.util.ArrayList;

public class BedrijfsInventaris {

    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> inventaris;

    public BedrijfsInventaris(String nm, double bud) {
        bedrijfsnaam = nm;
        budget = bud;
        inventaris = new ArrayList<>();
    }

    public void schafAan(Goed g) {
        if (g.huidigeWaarde() < budget && !inventaris.contains(g)) {
            budget -= g.huidigeWaarde();
            inventaris.add(g);
        }
    }

    public String toString() {
        String s = "Goederen in inventaris: " + "\n" + inventaris;
        String r = s.replace(", ", "\n");
        String t = r.replace("[", "");
        String zin = t.replace("]", "");
        return zin;
    }
}
