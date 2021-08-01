import java.util.Scanner;

public class RedAndBlue1469B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int r = sc.nextInt();
            int[] rArr = new int[r];

            for (int i = 0; i < r; i++) {
                rArr[i] = sc.nextInt();
            }

            int b = sc.nextInt();
            int[] bArr = new int[b];

            for (int i = 0; i < b; i++) {
                bArr[i] = sc.nextInt();
            }

            int maxR = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j <= i; j++) {
                    rArr[i] += rArr[j];
                        System.out.println("check1: " + rArr[i]);
                    if (rArr[i] > maxR) {
                        maxR = rArr[i];
                    }
                }
            }
            
            int maxB = 0;
            for (int i = 0; i < b; i++) {
                for (int j = 0; j <= i; j++) {
                    bArr[i] += bArr[j];
                    System.out.println("check2: " + bArr[i]);

                    if (bArr[i] > maxB) {
                        maxB = bArr[i];
                    }
                }
            }

            System.out.println(maxR + maxB);
        }
    }
}
