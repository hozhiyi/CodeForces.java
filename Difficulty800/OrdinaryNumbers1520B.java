/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty800;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class OrdinaryNumbers1520B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int d = 1;
            int k = 0;
            int ten = (int) Math.pow(10, k);

            while (d * ten <= n) {
                d++;
                if (d == 9) {
                    k++;
                    if (k == 8) {
                        break;
                    }
                }
            }
            System.out.println(d * ten);

            /*
            

            int counter = 10;

            if (n < 10) {

                System.out.println(n);

            } else if (n < 12) {

                System.out.println(n - 1);

            } else {
                int a = 0;
                int current = a * 100 + 11;

                while (current <= n) {

                    a++;
                    current = a * 100 + 11;
                    if (current <= n) {
                        counter += 9;
                    }
                }
                System.out.println(counter);
            }
             */
        }
    }
}
