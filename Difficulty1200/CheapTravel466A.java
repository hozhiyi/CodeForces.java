import java.util.Scanner;

public class CheapTravel466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cost = 0;

        if (m * a <= b) { // in all cases, buy many-way ticket is cheaper
            cost = n * a;
            System.out.println(cost);
        } else {
            if (n > m) {

                cost += (n / m) * b; // use many-way ticket to buy since we know that m*a<=b already
                n -= (n / m) * m; // *m to get the number tickets bought

                if (n * a < b) { // use one-way ticket to buy the leftover tickets needed
                    cost += n * a;
                } else { // use many-way ticket to but the leftover tickets needed
                    cost += b;
                }
                System.out.println(cost);
            } else {
                cost = Math.min(n * a, b);
                System.out.println(cost);
            }
        }
    }
}
