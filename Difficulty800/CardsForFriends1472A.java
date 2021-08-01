import java.util.Scanner;

public class CardsForFriends1472A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();

            if (n == 1 || n == 0) {
                System.out.println("YES");
            } else {
                int counter = 0; int power = 0;

                // while w is even or h is even and n hasnt been reached
                while ((w % 2 == 0 || h % 2 == 0) && counter <= n) {
                    // if w is even, update w to w/2, and n++, continue
                    if (w % 2 == 0) {
                        w /= 2;
                        power++;
                        counter = (int) Math.pow(2, power);
                        continue;
                    }
                    // if h is even, update h to h/2 and n++
                    if (h % 2 == 0) {
                        h /= 2;
                        power++;
                        counter = (int) Math.pow(2, power);
                    }
                }

                if (n <= counter) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
