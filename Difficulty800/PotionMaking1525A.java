import java.util.Scanner;

public class PotionMaking1525A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = 100 - n;
            int gcd = 1;

            if (n == 100) {
                System.out.println(1);
            } else {
                for (int i = 2; i <= Math.min(n, m); i++) {
                    if (n % i == 0 && m % i == 0) {
                        gcd = i;
                    }
                }
                n /= gcd;
                m /= gcd;
                System.out.println(n + m);
            }
        }
    }
}

