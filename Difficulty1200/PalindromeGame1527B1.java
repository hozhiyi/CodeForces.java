import java.util.Scanner;

public class PalindromeGame1527B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int length = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            char[] sArr = s.toCharArray();

            int counter = 0;
            for (int i = 0; i < sArr.length; i++) {
                if (sArr[i] == '0') {
                    counter++;
                }
            }
            if (counter % 2 == 0 || counter == 1) {
                System.out.println("BOB");
            } else if (counter % 2 != 0){
                System.out.println("ALICE");
            }
        }
    }
}
/*
1
3
000

 */