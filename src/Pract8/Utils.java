package Pract8;

import java.lang.String;

public class Utils {

    private static int aanroep;

    public static String euroBedrag(double bedrag) {
        aanroep += 1;

        return euroBedrag(bedrag, 2);
    }

    public static String euroBedrag(double bedrag, int precisie) {
        String s = "€" + String.format("%." + precisie + "f", bedrag);
        aanroep += 1;

        return s;
    }

    public static int getAanroep() {
        return aanroep;
    }
}
