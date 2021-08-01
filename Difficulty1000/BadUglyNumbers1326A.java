import java.util.Scanner;

public class BadUglyNumbers1326A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println(-1);
            } else {
                System.out.print(2);
                while (n-- > 1) {
                    System.out.print(3);
                }
            System.out.println();
            }
        }
    }
}
