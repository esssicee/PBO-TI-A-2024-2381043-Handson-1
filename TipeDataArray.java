public class TipeDataArray {
    public static void main(String[] args) {
      //cara 1
        int[]kumpulanNumber;
        kumpulanNumber = new int[3];

        //cara 2
        int[]kumpulanNumber2 = new int[3];

        //cara 3
        int[] kumpulanNumber3 = new int[] {1,2,3,4,5};

        Object[] icecool = new Object[3];

                //cara memasukan value ke array
        icecool[0] = "Gospel";
        icecool[1] = 100;
        icecool[2] = 'C';

        for (int i = 0; i < 3; i++) {
            System.out.println(icecool[i]);
        }


    }
}
