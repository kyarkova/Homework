package lesson170629;

import java.util.Random;

/**
 * Created by kseni on 29.06.2017.
 */
public class DataGenerator {
    // циклом, сортировкой, хешем
    static final byte[] ALPHABET = {'A', 'C', 'G', 'T'};

    public static byte[] generate(int size) {
        byte[] data = new byte[size];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = ALPHABET[random.nextInt(ALPHABET.length)];
        }

        return data;
    }
}
