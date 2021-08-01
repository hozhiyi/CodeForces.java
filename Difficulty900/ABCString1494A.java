/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class ABCString1494A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String str = sc.nextLine();
            //System.out.println("\n" + str);
            char[] strArr = str.toCharArray();

            int[] freq = new int[4];

            if (strArr[0] == strArr[str.length() - 1]) {
                System.out.println("NO");
            } else {

                for (int i = 1; i < str.length() - 1; i++) {
                    if (strArr[i] == 'A') {
                        freq[1]++;
                    } else if (strArr[i] == 'B') {
                        freq[2]++;
                    } else {
                        freq[3]++;
                    }
                    //System.out.println("a: " + freq[1] + " b: " + freq[2] + " c: " + freq[3]);
                }
                boolean wrong = false;

                if (str.length() > 2) {
                    if (freq[1] == 0) {
                        if (freq[2] != freq[3]) {
                            wrong = true;
                        }

                    } else if (freq[2] == 0) {
                        if (freq[1] != freq[3]) {
                            wrong = true;
                        }
                    } else if (freq[3] == 0) {
                        if (freq[2] != freq[1]) {
                            wrong = true;
                        }
                    }
                }

                if (wrong) {
                    System.out.println("NO");

                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
