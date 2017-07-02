package lesson170629;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by kseni on 01.07.2017.
 */
public class GenomeTest {
    private static final int GENOME_SIZE = 300000;
    private static final int WORD_SIZE = 4;
    public static void main(String[] args) {

        byte[] data = DataGenerator.generate(GENOME_SIZE);

        List<GenomeSortHash.Word> list = new ArrayList<>();

        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            list.add(new GenomeSortHash.Word(data, i));
        }

        Collections.sort(list);

        for (GenomeSortHash.Word word : list) {
            byte[] wordBytes = Arrays.copyOfRange(data, word.offset,
                    word.offset + WORD_SIZE);
            System.out.println(Arrays.toString(wordBytes));
        }

    }
}
