import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemOfEquations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] sA = s.split(" ");
        int a = Integer.parseInt(sA[0]);
        int b = Integer.parseInt(sA[1]);

        int counter = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i * i + j != i + j * j) {
                    counter++;
                }
            }
        }
        counter /= Math.min(a, b);
        System.out.println(counter);
    }
}
