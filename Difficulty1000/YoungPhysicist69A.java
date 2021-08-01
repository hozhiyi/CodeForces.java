import java.util.Scanner;

public class YoungPhysicist69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] v = new int[n][3];

        for (int i = 0; i < n; i++) {
            v[i][0] = sc.nextInt();
            v[i][1] = sc.nextInt();
            v[i][2] = sc.nextInt();
        }

        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;
        for (int i = 0; i < n; i++) {
            sumX += v[i][0];
            sumY += v[i][1];
            sumZ += v[i][2];
        }
        if (sumX != 0 || sumY != 0 || sumZ != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
