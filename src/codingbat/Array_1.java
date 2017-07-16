package codingbat;

/**
 * Created by kseni on 17.07.2017.
 */
public class Array_1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        return new int[]{max, max, max};
    }

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        }

        return nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int i : nums) {
            if (i == 2 || i == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        for (int i : nums) {
            if (i == 2 || i == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int[] res = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        if (nums[0] != nums[1]) {
            return false;
        }
        return nums[0] == 2 || nums[0] == 3;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length != 0) {
            if (a[0] == 1) {
                count++;
            }
        }
        if (b.length != 0) {
            if (b[0] == 1) {
                count++;
            }
        }
        return count;
    }


}
