import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] n = new int[input.length];

        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            n[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(n);

        for (int i = 1; i < n.length; i++) {

            if (n[i] == n[i - 1]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
