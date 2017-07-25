package lesson170717;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kseni on 17.07.2017.
 */
public class Concert {
    public static void main(String[] args) {

        List<MusicalInstruments> orchestra =
                Arrays.asList(new Drum(), new Flute(), new Guitar());
        for (MusicalInstruments mi : orchestra) {
            System.out.println(mi.getSound());
        }

    }

}
