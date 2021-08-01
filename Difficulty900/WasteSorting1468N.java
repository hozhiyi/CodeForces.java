import java.util.Scanner;

public class WasteSorting1468N {
    public static void main(String[] args) {
        // a4 - partially paper = 1st or 3rd
        // a5 - partially plastic = 2nd or 3rd
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            boolean penalty = false;

            int[] bin = new int[3];
            for (int i = 0; i < 3; i++) {
                bin[i] = sc.nextInt();
            }
            int[] waste = new int[5];
            for (int i = 0; i < 5; i++) {
                waste[i] = sc.nextInt();
            }

            for (int i = 0; i < 3; i++) {
                if (waste[i] > bin[i]) {
                    penalty = true;
                    break;
                }
                bin[i] -= waste[i];
            }

            if (waste[3] > bin[0] + bin[2]) {
                penalty = true;
            } else {
                waste[3] -= bin[0];
            }

            if (waste[4] > bin[1] + bin[2]) {
                penalty = true;
            } else {
                waste[4] -= bin[1];
            }

            if (penalty) {
                System.out.println("NO");
            } else {
                if (waste[3] + waste[4] <= bin[2]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
