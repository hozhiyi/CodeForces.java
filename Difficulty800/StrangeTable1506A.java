import java.util.Scanner;

public class StrangeTable1506A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();

            long r = (x - 1) % n + 1;
            long c = (long) Math.ceil((double)x / n);
            x = (r - 1) * m + c;
            System.out.println(x);
        }
    }
}
