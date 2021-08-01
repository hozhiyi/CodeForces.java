/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty900;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class SumOf20501517A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {

            long n = sc.nextLong();
            String nStr = "" + n;
            long basic = 2050;
            long ten;
            int counter = 0;
            if (n < basic) {
                System.out.println(-1);
            } else {

                for (int i = nStr.length() - 4; i >= 0; i--) {
                    ten = (long) Math.pow(10, i);
                    basic *= ten;

                    while (n >= basic) {
                        n -= basic;
                        counter++;
                    }

                    basic = 2050;
                }
                if (n == 0) {
                    System.out.println(counter);
                } else {
                    System.out.println("-1");
                }
            }

        }
    }
}
