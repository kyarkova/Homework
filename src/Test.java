public class Test {


    public static void main(String[] args) {
        int [][] arr = {{1,2,3},    // 00 01 02
                        {2,5,0},    // 10 11 12
                        {3,0,6}};   // 20 21 22
        System.out.println(diag(arr));
        int [][] arr1 = {{1,2,4},    // 00 01 02
                         {2,5,0},    // 10 11 12
                         {3,0,6}};   // 20 21 22
        System.out.println(diag(arr1));
    }


    public static boolean diag(int [][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j >= 0; j--) {
                System.out.println(arr[i][j]  + " " + arr[j][i]);
                if(arr[i][j]!=arr[j][i]) return false;
            }
        }
        return true;
    }

}
