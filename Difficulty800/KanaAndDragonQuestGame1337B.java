import java.util.Scanner;

public class KanaAndDragonQuestGame1337B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt(); // dragon's hitpoint
            int n = sc.nextInt();
            int m = sc.nextInt();

            while (n > 0) {
                if (x / 2 + 10 < x) {
                    x = x / 2 + 10;
                    n--;
                } else {
                    if (m > 0) {
                        x -= 10;
                        m--;
                    } else {
                        break;
                    }
                }
            }
            while (m > 0) {
                x -= 10;
                m--;
            }
            if (x <= 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
