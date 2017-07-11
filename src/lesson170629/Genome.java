package lesson170629;

/**
 * Created by kseni on 29.06.2017.
 */
public class Genome {
    private static final int GENOME_SIZE = 30;

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(GENOME_SIZE);
//        System.out.println(Arrays.toString(data));

//        int i = 0;
        for (byte b : data) {
//            System.out.print(i++);
            System.out.print((char) b);
        }
//        byte[] data = {'A', 'B', 'C', 'D', 'A', 'B', 'C', 'K','A', 'B', 'C'};
        findDuplicates(data, 3);
    }

    private static void findDuplicates(byte[] data, int w) {

        System.out.println();
        for (int i = 0; i < data.length - w; i++) {
            inner:
            for (int j = i + 1; j < data.length - w + 1; j++) {
                for (int k = 0; k < w; k++) {
                    if (data[i + k] != data[j + k]) {
                        continue inner;
                    }
                }
                System.out.println("найдены дубликаты : " + "i = " + i + ",  j = " + j);
            }
        }


    }


}
