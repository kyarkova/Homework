package lesson170629;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.lang.System.currentTimeMillis;

/**
 * Created by kseni on 01.07.2017.
 */
public class GenomeWithHash {
    private static final int GENOME_SIZE = 60_000;
    private static final int WORD_SIZE = 2;

    static class Word implements Comparable<GenomeWithHash.Word> {
        byte[] data;
        int offset;

        public Word(byte[] data, int i) {
            this.data = data;
            offset = i;
        }

        @Override
        public int compareTo(GenomeWithHash.Word otherWord) {
            for (int i = 0; i < WORD_SIZE; i++) {
                int diff = data[offset + i] - data[otherWord.offset + i];
                if (diff != 0) {
                    return diff;
                }
            }
            return 0;
        }

        @Override
        public String toString() {
            String res = "";
            for (int i = 0; i < WORD_SIZE; i++) {
                res += (char) (data[offset + i]);
            }
            return res;
        }

        @Override
        public boolean equals(Object otherWord) {
            Word other = (Word) otherWord;
            for (int i = 0; i < WORD_SIZE; i++) {
                if (data[offset + i] != data[other.offset + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public int hashCode() {
            byte[] wordBytes = Arrays.copyOfRange(data, offset, offset + WORD_SIZE);
            return Arrays.hashCode(wordBytes);
        }
    }

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(GENOME_SIZE);
        long start = currentTimeMillis();

        HashMap<Word, Integer> mapWords = new HashMap<>();

        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            Word word = new GenomeWithHash.Word(data, i);
            Integer frequency = mapWords.get(word);
            mapWords.put(word, frequency == null ? 1 : frequency + 1);
        }
        System.out.println(mapWords.toString());
        System.out.println(mapWords.size());
        long end = currentTimeMillis();

        System.out.println("Время выполнения : " + (end - start));
    }
}
