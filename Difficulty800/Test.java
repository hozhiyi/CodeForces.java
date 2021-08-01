public class Test {
    public static void main(String[] args) {
        time();
        //array();

    }

    static void time() {
        //long start = System.currentTimeMillis();

        long start = System.nanoTime();

        for (int i = 0; i < 100; i++) {
            System.out.println("test");
        }

        //long end = System.currentTimeMillis();

        long end = System.nanoTime();

        //double total = (double)(end - start) / 1000;
        double total = (double) (end - start) / 1000000000;
        System.out.println("Total time = " + total);
    }


    static void array() {
        int[][][] a = new int[3][3][3];
        int[][] b = new int[3][3];

        a[0][0][0] = 1;
        a[0][0][1] = 12;
        a[0][0][2] = 13;

        a[0][1][0] = 2;
        a[0][1][1] = 22;
        a[0][1][2] = 23;

        a[0][2][0] = 3;
        a[0][2][1] = 32;
        a[0][2][2] = 33;

        b = a[0];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println("b[" + i + "][" + j + "] = " + b[i][j]);
            }
        }

    }
}
