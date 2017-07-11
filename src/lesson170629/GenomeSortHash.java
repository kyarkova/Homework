package lesson170629;

import java.util.*;

import static java.lang.System.currentTimeMillis;

/**
 * Created by kseni on 01.07.2017.
 */
public class GenomeSortHash {

    private static final int GENOME_SIZE = 60_000;
    private static final int WORD_SIZE = 4;

    static class Word implements Comparable<Word> {
        byte[] data;
        int offset;

        public Word(byte[] data, int i) {
            this.data = data;
            offset = i;
        }

        @Override
        public int compareTo(Word otherWord) {
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

        //решение задачи с помощью HashMap
        long start = currentTimeMillis();
        HashMap<GenomeSortHash.Word, Integer> mapWords = new HashMap<>();

        for (int i = 0; i < data.length - WORD_SIZE + 1; i++) {
            GenomeSortHash.Word word = new GenomeSortHash.Word(data, i);
            Integer frequency = mapWords.get(word);
            mapWords.put(word, frequency == null ? 1 : frequency + 1);
        }
//       System.out.println(mapWords);
        System.out.println("Последовательность содержит " + mapWords.size() + " уникальных элементов.");
        long end = currentTimeMillis();

        System.out.println("Время выполнения задачи с помощью HashMap: " + (end - start));

        //решение задачи сортировкой
        start = currentTimeMillis();
        List<Word> list = new ArrayList<>();

        for (int i = 0; i < data.length - WORD_SIZE + 1; i++) {
            list.add(new Word(data, i));
        }

        Collections.sort(list);
//        System.out.println(list.size());
//        for (Word word : list) {
//            System.out.println(word);
//        }

        int countDup = 1;
        int countUnique = 0;
        for (int k = 0; k < list.size(); k++) {
            while (k + 1 < list.size() && list.get(k).equals(list.get(k + 1))) {
                countDup++;
                if (k + 1 <= list.size()) {
                    k++;
                } else {
                    break;
                }
            }
            countUnique++;
//           System.out.println(list.get(k) + " " + countDup);
            countDup = 1;
        }
        System.out.println("Последовательность содержит " + countUnique + " уникальных элементов.");
        end = currentTimeMillis();
        System.out.println("Время выполнения при сортировке: " + (end - start));

    }

}
