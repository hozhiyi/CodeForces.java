import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int counter = 0;

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a + b + c >= 2) {
                counter++;
            }

        }
        System.out.println(counter);
    }
}
