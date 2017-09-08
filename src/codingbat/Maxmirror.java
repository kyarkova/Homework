package codingbat;

public class Maxmirror {
    public static void main(String[] args) {
        System.out.println(maxMirror(new int[]{7, 1, 2, 9, 7, 2, 1, 3}));
        //System.out.println(maxMirror(new int[]{1, 2, 9, 5,7, 2, 1}));


    }


    public static int maxMirror(int[] nums) {

        int length = nums.length;
        int count = 0;
        int res = 0;
        for (int i = 0; i < length; i++) {
            count = 0;
            for (int j = length - 1; i + count < length && j > -1; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        res = Math.max(count, res);
                        count = 0;
                    }
                }
            }
            res = Math.max(count, res);
        }
        return res;
    }
}


