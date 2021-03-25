package Pract8;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] arg) {
        BedrijfsInventaris bdr1 = new BedrijfsInventaris("Rijkswaterstaat", 300000);

        Computer cp1 = new Computer("Dell", "00:0C:6E:D2:11:E6", 800, 2018);
        Computer cp2 = new Computer("Dell", "00:0C:6E:D2:11:E6", 800, 2018);

        Computer cp3 = new Computer("Lenovo", "00:0B:8I:D2:11:A2", 800, 2018);

        Auto a1 = new Auto("Ford Mondeo", 35000, 2006, "SZ-001-K");
        Auto a2 = new Auto("Ford Mondeo", 35000, 2006, "SZ-001-K");

        Auto a3 = new Auto("Alfa Romeo Giulia", 40000, 2016, "PR-040-J");

        Fiets f1 = new Fiets("Gazelle", 200, 2016, 7);
        Fiets f2 = new Fiets("Gazelle", 200, 2016, 7);

        Fiets f3 = new Fiets("Batavus", 300, 2014, 5);

        bdr1.schafAan(a1);
        bdr1.schafAan(a2);
        bdr1.schafAan(a3);
        bdr1.schafAan(f1);
        bdr1.schafAan(f2);
        bdr1.schafAan(f3);
        bdr1.schafAan(cp1);
        bdr1.schafAan(cp2);
        bdr1.schafAan(cp3);

        System.out.println(bdr1.toString());

        System.out.println("\nUtils is " + Utils.getAanroep() + " keer aangeroepen");
    }
}
