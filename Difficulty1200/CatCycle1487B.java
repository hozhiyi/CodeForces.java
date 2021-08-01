import java.util.Scanner;

public class CatCycle1487B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int p = sc.nextInt();
            int h = sc.nextInt();
            h--;
            int floor = p / 2;
            System.out.println((h + (p % 2) * h / floor) % p + 1);
            /*

            if (p % 2 == 0) {
                if (h <= p) {
                    System.out.println(h);
                } else {
                    if (h % 2 == 0) {
                        // h = 6 p = 4 output = 2
                        System.out.println(h % p);
                    } else {
                        System.out.println(h - (h / p) * p);

                    }
                }

            } else {
                if (p <= 3) {
                    switch (h) {
                        case 1:
                            System.out.println(1);
                            break;
                        case 2:
                            System.out.println(3);
                            break;
                        case 3:
                            System.out.println(2);
                            break;
                    }

                } else {
                    int f = p / 2;
                    System.out.println((h + (p % 2) * h / f) % p);

                }
            }
             */
        }
    }
}
