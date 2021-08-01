/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty1000;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class FairNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long p = sc.nextLong();
            long n = p;
            ArrayList<Long> d = new ArrayList<>();
            boolean[] m = new boolean[10];

            while (n > 0) {
                long temp = n % 10;
                if (!m[(int) temp] && temp != 0) {
                    m[(int) temp] = true;
                }
                n /= 10;
            }

            for (int i = 1; i < m.length; i++) {
                if (m[i]) {
                    d.add((long) i);
                }
            }

            if (checkFair(p, d)) {
                System.out.println(p);
            } else {

                while (!checkFair(p, d)) {
                    d.clear();
                    for (int i = 0; i < m.length; i++) {
                        m[i] = false;
                    }
                    p++;
                    n = p;
                    while (n > 0) {
                        long temp = n % 10;
                        if (!m[(int) temp] && temp != 0) {
                            m[(int) temp] = true;
                        }
                        n /= 10;
                    }

                    for (int i = 1; i < m.length; i++) {
                        if (m[i]) {
                            d.add((long) i);
                        }
                    }
                    System.out.println("p: " + p);
                    checkFair(p, d);
                }
                System.out.println(p);
            }
        }
    }

    static boolean checkFair(long n, ArrayList d) {
        for (int i = 0; i < d.size(); i++) {
            if (n % (long) d.get(i) != 0) {
                System.out.println("NO: " + d.get(i));
                return false;
            }
        }
        return true;
    }

}
