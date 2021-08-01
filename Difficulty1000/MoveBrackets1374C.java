import java.util.ArrayList;
import java.util.Scanner;

public class MoveBrackets1374C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            char[] strArr = str.toCharArray();

            ArrayList<Character> strAL = new ArrayList<>();
            for (int i = 0; i < strArr.length; i++) {
                strAL.add(strArr[i]);
            }

            int balance = 0;
            int move = 0;

            for (int i = 0; i < strAL.size(); i++) {
                if (strAL.get(i).equals('(')) {
                    balance++;

                } else {
                    balance--;
                    if (balance < 0) {
                        strAL.remove(i);
                        strAL.add(strAL.size(), ')');
                        i--;
                        move++;
                        balance++;
                    }
                }
            }
            System.out.println(move);
        }
    }
}
