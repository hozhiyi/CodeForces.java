import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        char[] c = input.toCharArray();

        int counter = 1;
        for (int i = 1; i < c.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                counter++;
            }
        }
        if (counter % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
