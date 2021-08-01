import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectPermutation233A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        if (n % 2 == 0) {
            int[] nArr = new int[n];
            for (int i = 0; i < n; i++) {
                nArr[i] = i + 1;
                if ((i + 1) % 2 == 0) {
                    int temp = nArr[i];
                    nArr[i] = nArr[i - 1];
                    nArr[i - 1] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(nArr[i] + " ");
            }
        } else {
            System.out.println(-1);
        }
    }
}
