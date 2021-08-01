import java.util.Arrays;
import java.util.Scanner;

public class ValeriiAgainstEveryone1438B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int length = sc.nextInt();
            int[] nArr = new int[length];
            for (int i = 0; i < length; i++) {
                nArr[i] = sc.nextInt();
            }

            Arrays.sort(nArr);

            boolean found = false;
            for (int i = 1; i < length; i++) {
                if (nArr[i] == nArr[i - 1]) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
