import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PhoenixAndGold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); // pieces of gold
            int x = sc.nextInt(); // exploding weight
            int[] nArr = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                nArr[i] = sc.nextInt();
                sum += nArr[i];
            }

            if (sum == x) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                Arrays.sort(nArr);
                int weight = 0;
                for (int i = 0; i < nArr.length; i++) {
                    if (weight + nArr[i] == x) {
                        int temp = nArr[i];
                        nArr[i] = nArr[i + 1];
                        nArr[i + 1] = temp;
                    }
                    System.out.print(nArr[i] + " ");
                    weight += nArr[i];
                }
                System.out.println();
            }
        }
    }
}
