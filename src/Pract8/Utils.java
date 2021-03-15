package Pract8;

import java.lang.String;

public class Utils {

    public static String euroBedrag(double bedrag) {
        String s = "€" + String.format("%.2f", bedrag);

        return s;
    }

    public static String euroBedrag(double bedrag, int precisie) {
        String s = "€" + String.format("%." + precisie + "f", bedrag);
        return s;
    }
}
