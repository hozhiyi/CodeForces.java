import java.util.ArrayList;
import java.util.Scanner;

public class Football43A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        ArrayList<String> strArr = new ArrayList<>();
        ArrayList<Integer> counter = new ArrayList<>();

        for (int i = 0; i < t; i++) {

            String temp = sc.nextLine();

            if (strArr.contains(temp)) {
                counter.set(strArr.indexOf(temp), counter.get(strArr.indexOf(temp)) + 1);
            } else {
                strArr.add(temp);
                counter.add(1);
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < counter.size(); i++) {
            maxIndex = counter.indexOf(Math.max(counter.get(i - 1), counter.get(i)));
        }

        System.out.println(strArr.get(maxIndex));
    }
}
