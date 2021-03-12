package Pract8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BedrijfsInventarisTest {

    @Test
    void eenVanTweeObjectenAangeschaft() {
        BedrijfsInventaris bdr1 = new BedrijfsInventaris("Rijkswaterstaat", 345.60);

        Computer cp1 = new Computer("Dell", "00:0C:6E:D2:11:E6", 800, 2018);
        Computer cp2 = new Computer("Dell", "00:0C:6E:D2:11:E6", 800, 2018);

        bdr1.schafAan(cp1);
        bdr1.schafAan(cp2);

        assertEquals("Goederen in inventaris: \nComputer: Dell met bouwjaar 2018 heeft een waarde van: €172,80", bdr1.toString());
    }

    @Test
    void aanschaffenMisluktMetOnvoldoendeBudget() {
        BedrijfsInventaris bdr1 = new BedrijfsInventaris("Rijkswaterstaat", 10);

        Computer cp1 = new Computer("Dell", "00:0C:6E:D2:11:E6", 800, 2018);

        bdr1.schafAan(cp1);

        assertEquals("Goederen in inventaris: \n", bdr1.toString());
    }

    @Test
    void berekenenHuidigeWaardeGebeurtCorrect() {
        Computer cp1 = new Computer("Dell", "00:0C:6E:D2:11:E6", 800, 2018);

        assertEquals("172,80", String.format("%.2f", cp1.huidigeWaarde()));
    }
}